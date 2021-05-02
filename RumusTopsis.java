/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topsis;

/**
 *
 * @author ACER
 */
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import static javax.swing.GroupLayout.Alignment.*; 
public class RumusTopsis {
    JFrame f; 
public void JFrameTopsis1(int [][] data_nor){    
       
   
    Object[][] testing =new Object[data_nor.length][data_nor[0].length];
    
    for(int i=0; i<data_nor.length;i++)
    {
        for(int j=0; j<data_nor[i].length;j++)
        {
            testing[i][j]=data_nor[i][j];
        }
    }
    }


    public  double[][]  normalisasi(int[][] array,int[] bobot)
    { 
     int[][] transpose_m = new int [array[0].length][array.length];
     for(int i=0; i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                transpose_m[j][i]=array[i][j];
            }
        }
        
        double[][] value = new double[array[0].length][array.length];
         double[] pembagi=new double[transpose_m.length];
      
        for(int i=0; i<transpose_m.length;i++)
        {
            double tam=0;
           
            for(int j=0; j<transpose_m[i].length;j++)
            {
                 tam= tam + Math.pow(transpose_m[i][j],2);
            }
            pembagi[i]= Math.sqrt(tam);
        }
        
        for(int i=0; i < transpose_m.length;i++)
        {
            for(int j=0; j < transpose_m[i].length;j++)
            {
                value[i][j]=(transpose_m[i][j]/pembagi[i]) * bobot[i];
            }
        }
    
        return value;
    }
    public  double[] max(double [][]data_norm_bobot, int[] data_bobot)
    {
        double [] max = new double[data_bobot.length];
        for (int i=0; i<data_norm_bobot.length; i++)
        {
            max[i]=0;
            for(int j=0; j<data_norm_bobot[i].length; j++)
            {
                if(data_bobot[i] == 1)
                {
                    if(max[i] < data_norm_bobot[i][j] || max[i]==0){
                        max[i] = data_norm_bobot[i][j];
                    }
                }
                else
                {
                    if(max[i] > data_norm_bobot[i][j] || max[i]==0){
                        max[i] = data_norm_bobot[i][j];
                    }
                }

            }
        }
        return max;
    }
    
    public  double[] min(double[][] data_norm_bobot, int[] data_bobot)
    {
         double [] min = new double[data_bobot.length];
        for (int i=0; i<data_norm_bobot.length; i++)
        {
            min[i]=0;
            for(int j=0; j<data_norm_bobot[i].length; j++)
            {
                if(data_bobot[i] == 1)
                {
                    if(min[i] > data_norm_bobot[i][j] || min[i]==0){
                        min[i] = data_norm_bobot[i][j];
                    }
                }
                else
                {
                    if(min[i] < data_norm_bobot[i][j] || min[i]==0){
                        min[i] = data_norm_bobot[i][j];
                    }
                }

            }
        }
        return min;
    }
    
    public  double[] alternatifDp(double[][] data_norm_bobot, double[] max1)
    {
        double[][] data_normal= new double[data_norm_bobot[0].length][data_norm_bobot.length];
        double[] value=new double[data_norm_bobot[0].length];
        for(int i=0; i<data_norm_bobot.length; i++)
        {
            for(int j=0; j<data_norm_bobot[i].length; j++)
            {
                data_normal[j][i]=data_norm_bobot[i][j];
            }
        }
        
        //memasukkan nilai
         for(int i=0; i<data_normal.length; i++)
        {
            double tambah=0;
            for(int j=0; j<data_normal[i].length; j++)
            {
                tambah+= Math.pow((max1[j] - data_normal[i][j]),2);
             
            }
           value[i]=Math.sqrt(tambah);
        }
        return value;
    }
    public  double[] alternatifDm(double[][] data_norm_bobot, double[] min1)
    {
        double[][] data_normal= new double[data_norm_bobot[0].length][data_norm_bobot.length];
        double[] value=new double[data_norm_bobot[0].length];
        for(int i=0; i<data_norm_bobot.length; i++)
        {
            for(int j=0; j<data_norm_bobot[i].length; j++)
            {
                data_normal[j][i]=data_norm_bobot[i][j];
            }
        }
        
        //memasukkan nilai
         for(int i=0; i<data_normal.length; i++)
        {
            double tambah=0;
            for(int j=0; j<data_normal[i].length; j++)
            {
                tambah+= Math.pow((data_normal[i][j] - min1[j]),2);
            }
            value[i]=Math.sqrt(tambah);
        }
         return value;
        
    }
    public  void prefrensi(double[] dp,double[] dm,String[] data,int [] bobot,int [][] data_nor,int [] data_bobot)
    {
        double[] value = new double[dp.length];
        System.out.println("Nilai Prefensi :");
        for(int i =0; i< dp.length; i++)
        {
            value[i]= dm[i]/(dm[i] + dp[i]);
            System.out.println( data[i]+" = "+value[i]);
        }
         double besar=0;
         String rank1="";
         
       for(int i =0; i< dp.length; i++)
        {
           
            if(besar==0 || besar < value[i])
            {
                besar=value[i];
                rank1=data[i];
            }
        }
//       System.out.println("data prefensi terbaik "+rank1+" = "+besar);
        f=new JFrame("DATA NORMALISASI"); 
        Container myPane=f.getContentPane();
        GroupLayout layout = new GroupLayout(myPane);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        myPane.setLayout(layout);
        
        //make label and decalaration
        JLabel data_nor1= new javax.swing.JLabel();
        JLabel bobot2= new javax.swing.JLabel();
        JLabel benefit3 = new javax.swing.JLabel();
        JLabel data_refrensi4 = new javax.swing.JLabel();
        JLabel pilihan_terbaik5 = new javax.swing.JLabel();
        
        data_nor1.setText("data normalisasi");
        bobot2.setText("Bobot Data ");
        benefit3.setText("Benefit Or Cost ");
        data_refrensi4.setText("Data refrensi");
        pilihan_terbaik5.setText("Pilihan Terbaik Data");
        //end 
        //declaration and change type of variable data
        //data normaliasasi
        Object[][] data_nor1_1= new Object[data_nor.length][data_nor[0].length];
        for(int i=0; i<data_nor.length;i++)
        {
            for(int j=0; j<data_nor[i].length;j++)
            {
                data_nor1_1[i][j]=data_nor[i][j];
            }
        }
       
        String[] col_data_nor1_1={"Lokasi","Luas Tanah","Harga","Ukuran","Resiko"};
        JTable jt1 = new JTable(data_nor1_1,col_data_nor1_1);
        jt1.setBounds(30,40,200,300);     
        JScrollPane js_data_nor1=new JScrollPane(jt1);
        
        
        //bobot
        Object[][] bobot1_1= new Object[1][bobot.length];
        
        for(int i=0; i<1;i++){
            for(int j=0; j<bobot.length;j++)
            {
               bobot1_1[i][j]=bobot[j]; 
            }
        }
        JTable jt2=new JTable(bobot1_1,col_data_nor1_1);
        jt2.setBounds(30,40,200,300);
        JScrollPane js_bobot2=new JScrollPane(jt2);
        
        //data_bobot
        Object[][] data_bobot3_3= new Object[1][data_bobot.length];
        for(int i=0; i<1; i++){
            for(int j=0; j<data_bobot.length;j++)
            {
                if(data_bobot[j]==1)
                {
                data_bobot3_3[i][j]="Benefit";
                }
                else{
                 data_bobot3_3[i][j]="Cost";
                }
            }
        }
        JTable jt3 = new JTable(data_bobot3_3,col_data_nor1_1);
        jt3.setBounds(30,40,200,300);
        JScrollPane js_data_bobot3=new JScrollPane(jt3);
        
        
        
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(js_data_nor1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(data_nor1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(js_bobot2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(bobot2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(benefit3))
                     .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(js_data_bobot3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    )
                )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(data_nor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_data_nor1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addComponent(bobot2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js_bobot2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addComponent(benefit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js_data_bobot3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE) 
            )
        );
         f.pack();
    f.setVisible(true);
    }

   
}
