/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topsis;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
 


public class JFrameTopsis extends javax.swing.JFrame {
    int x=0;
      int[][] testing=new int[3][5];
   
    /**
     * Creates new form JFrameTopsis
     */
    public JFrameTopsis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        input_frensi = new javax.swing.JTextField();
        input_lokasi = new javax.swing.JComboBox<>();
        input_luas_tanah = new javax.swing.JComboBox<>();
        input_harga = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        data_nor = new javax.swing.JTable();
        save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name Prefensi");

        input_lokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jalanA", "jalanB", "jalanC" }));

        input_luas_tanah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lokasi", "Luas Tanah", "Harga", "Ukuran", "Resiko" }));

        input_harga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel2.setText("Refresni");

        jLabel3.setText("Kategori");

        jLabel4.setText("Value");

        data_nor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lokasi", "Luas  Tanah", "Harga", "Ukuran", "Resiko"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(data_nor);

        save.setText("Input");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_lokasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_frensi)
                            .addComponent(input_luas_tanah, javax.swing.GroupLayout.Alignment.TRAILING, 0, 84, Short.MAX_VALUE)
                            .addComponent(input_harga, 0, 84, Short.MAX_VALUE)))
                    .addComponent(save)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(697, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(input_frensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_luas_tanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
//        DefaultTableModel DataModel=(DefaultTableModel) data_nor.getModel();
//        DefaultTableModel DataRefrensi=(DefaultTableModel) tbl_refrensi.getModel();
//        DefaultTableModel DataBobot=(DefaultTableModel) tbl_bobot.getModel();
//        DefaultTableModel DataBC= (DefaultTableModel) tbl_b_c.getModel();
//        
//         ArrayList testing= new ArrayList<Integer>();
//       ArrayList<String> names= new ArrayList<String>();
//        ArrayList bobot = new ArrayList<Integer>();
//        ArrayList bc= new ArrayList<Integer>();
//        
//        
//        data_nor.setAutoCreateColumnsFromModel(true);
//        tbl_refrensi.setAutoCreateColumnsFromModel(true);
//        tbl_bobot.setAutoCreateColumnsFromModel(true);
//        tbl_b_c.setAutoCreateColumnsFromModel(true);
//        
//        bc.add(input_b_c.getSelectedItem());
//        testing.add(input_lokasi.getSelectedItem());
//        testing.add(input_luas_tanah.getSelectedItem());
//        testing.add(input_harga.getSelectedItem());
//        testing.add(input_ukuran.getSelectedItem());
//        testing.add(input_resiko.getSelectedItem());
//        names.add(input_frensi.getText());
//        bobot.add(input_bobot.getSelectedItem());
//        
//        DataBC.addRow(bc.toArray());
//        DataModel.addRow(testing.toArray());
//       DataRefrensi.addRow(names.toArray());
//       DataBobot.addRow(bobot.toArray());

  
    int tes=input_lokasi.getSelectedIndex();
    int tes1=input_lokasi.getSelectedIndex();
    testing[tes][tes1]=input_harga.getSelectedIndex();
    int test=testing[tes][tes1];
    System.out.println(testing[tes][tes1]);
     DefaultTableModel DataModel=(DefaultTableModel) data_nor.getModel();
     DataModel.addRow(testing);
    
    }//GEN-LAST:event_saveActionPerformed
    public Object[][] getTableData (JTable table) {
    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
    Object[][] tableData = new Object[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++){
        for (int j = 0 ; j < nCol ; j++){
            tableData[i][j] = dtm.getValueAt(i,j);
        }
    }
    return tableData;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) data_nor.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
    Object[][] tableData = new Object[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++){
        for (int j = 0 ; j < nCol ; j++){
            tableData[i][j] = dtm.getValueAt(i,j);
            System.out.println(tableData[i][j]);
        }
    }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTopsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTopsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTopsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTopsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTopsis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data_nor;
    private javax.swing.JTextField input_frensi;
    private javax.swing.JComboBox<String> input_harga;
    private javax.swing.JComboBox<String> input_lokasi;
    private javax.swing.JComboBox<String> input_luas_tanah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
