/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pertemuan8tugas2;
import java.util.Scanner;
/**
 *
 * @author diana
 */
public class Pertemuan8tugas2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Tahun Akhir?: ");
        int tahunAkhir = myInput.nextInt();
        
        System.out.println("Tahun Awal?: ");
        int tahunAwal = myInput.nextInt();
        
        System.out.println("Hasil nya: ");
        
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }    
}