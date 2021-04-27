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
public class RumusTopsis {
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
    public  void prefrensi(double[] dp,double[] dm,String[] data)
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
       System.out.println("data prefensi terbaik "+rank1+" = "+besar);
    }
}
