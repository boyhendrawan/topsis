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
import javax.swing.*;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import static javax.swing.GroupLayout.Alignment.*; 
public class NewClass {
    
     JFrame f;    
    NewClass(){    
    f=new JFrame();  
    Container myPane=f.getContentPane();
    
   
         JLabel bobot = new javax.swing.JLabel();
    bobot.setText("bobot");
    GroupLayout grouplayout = new GroupLayout(myPane);
    grouplayout.setAutoCreateGaps(true);
    grouplayout.setAutoCreateContainerGaps(true);
    myPane.setLayout(grouplayout);
    
    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};  
     Object data1[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};  
    String column[]={"ID","NAME","SALARY"};
    String column1[]={"ID1","NAME1","SALARY1"};
    
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt); 
          
    JTable jt1=new JTable(data1,column1);    
    jt1.setBounds(30,40,200,300);          
    JScrollPane sp1s=new JScrollPane(jt1); 
//    f.add(sp);          
    
    grouplayout.setHorizontalGroup(
    grouplayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(grouplayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(grouplayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sp1s, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGroup(grouplayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(bobot))
                .addComponent(sp,   javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
    );
  
        grouplayout.setVerticalGroup(
         grouplayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(grouplayout.createSequentialGroup()
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGap(23,23,23)
                    .addComponent(bobot)
                    .addComponent(sp1s, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(bobot)
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(18, 18, 18)
                   .addContainerGap(374,Short.MAX_VALUE))
        );   
    f.pack();
    f.setVisible(true);
}     
public static void main(String[] args) {    
    new NewClass();    
}    
    
}
