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
public class TOPSIS extends RumusTopsis {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        
        String[] names={"jalanA","jalanB","JalanC"};
        String[] categories={"lokasi","luas tanah","harga","ukuran","resiko"};
        int[] bobot={5,4,4,3,4};
        int[] data_bobot={1,1,0,1,0};
        // 1 =  benefit
        //0 = cost
        int[][] data_nor ={
                          {4,2,5,3,1},
                          {2,5,2,4,4},
                          {3,4,3,4,3}};
        
        //Pencarian nilai dari Normalisasi terbobot
        double[][] data_norm_bobot;
        double[] min,max,dp,dm;
        
        TOPSIS Problem1 = new TOPSIS();
        Problem1.JFrameTopsis1(data_nor);
        data_norm_bobot=Problem1.normalisasi(data_nor,bobot);
        
        //max min
       
        min= Problem1.min(data_norm_bobot,data_bobot);
        max=Problem1.max(data_norm_bobot,data_bobot);
        dm=Problem1.alternatifDm(data_norm_bobot,min);
        dp=Problem1.alternatifDp(data_norm_bobot,max);
        
        
       Problem1.prefrensi(dp,dm,names,bobot,data_nor,data_bobot);
        
        
    }   
}
