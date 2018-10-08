/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan34_.oo.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan penjumlahan,
 *                     pengurangan,perkalian seperti pada kalkulator dimana
 *                     angkanya di input oleh user
 */
public class PBO3_10117098_Latihan34_OOKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
     Scanner scn = new Scanner(System.in);
        Kalkulator kalkutor = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 : ");
        kalkutor.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        kalkutor.value2 = scn.nextDouble();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalkutor.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkutor.kurangBiangan());
        System.out.println("Hasil Perkalian\t  : "+kalkutor.kaliBilangan());
        System.out.println("Hasil Pembagian\t  : "+df.format
        (kalkutor.bagiBilangan()));
        System.out.println("Hasil Sisa\t  : "+kalkutor.sisaBilangan());
    }
    
}
