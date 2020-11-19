/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanlaptop;

import java.util.Scanner;
/**
 *
 * @author Manda Salsa
 */
public class PenjualanLaptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] id = {"0","1","2"};
        String[] laptop = {"lenovo","hp","asus"};
        int[] harga = {1200000, 1500000, 1800000}; 
        int totalharga,totalbayar,diskon,nominal,kembalian;
        
        Scanner input = new Scanner(System.in);
        System.out.println("----SELAMAT DATANG-----");
        System.out.println("DAFTAR LAPTOP DAN HARGA");
        System.out.println("-----------------------");
        
        for (int a=0; a<harga.length; a++){
        System.out.println(id[a]+" Laptop " +laptop[a] +" harga = Rp. "+harga[a]);
        }
        System.out.println("Masukkan pilihan");
        int pilihan = input.nextInt();
        System.out.println("Laptop : "+laptop[pilihan]);
        System.out.println("Jumlah laptop yang dibeli :");
        int jmlh = input.nextInt();
        totalharga = harga[pilihan]*jmlh;
        System.out.println("Total Harga : Rp. "+totalharga);
        
        diskon = totalharga*20/100;
        totalbayar = totalharga-diskon;
        
        
        if (totalharga >=2000000){
            System.out.println("========================");
            System.out.println("ANDA MENDAPAT DISKON 30%");   
            System.out.println("\nDiskon 35% = "+diskon);
            System.out.println("Total Bayar = "+totalbayar);
            
            System.out.println("Input nominal pembayaran = ");
            nominal = input.nextInt();
            kembalian = nominal-totalbayar;
            System.out.println("==========================");
            System.out.println("Kembalian Anda = "+kembalian);      
            System.out.println("TERIMAKASIH SELAMAT DATANG KEMBALI");
        }else {
            System.out.println("==========================");
            System.out.println("ANDA TIDAK MENDAPAT DISKON");
            System.out.println("Input nominal pembayaran =");
            nominal = input.nextInt();
            kembalian = nominal-totalharga;
            System.out.println("==========================");
            System.out.println("Kembalian Anda = "+kembalian);
            System.out.println("TERIMAKASIH SELAMAT DATANG KEMBALI");
        }       
      }
}
        