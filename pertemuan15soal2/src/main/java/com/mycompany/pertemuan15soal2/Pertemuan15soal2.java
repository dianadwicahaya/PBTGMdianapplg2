/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15soal2;
import kalkulatorpack.kalkulatorkurang;
import kalkulatorpack.kalkulatorbagi;
import kalkulatorpack.kalkulatorkali;

/**
 *
 * @author diana
 */
public class Pertemuan15soal2 {

    public static void main(String[] args) {
       
        //Membuat objek dari masing-masing kelas
        kalkulatorkurang kalkulatorKurang = new kalkulatorkurang();
        kalkulatorbagi kalkulatorBagi = new kalkulatorbagi();
        kalkulatorkali kalkulatorKali = new kalkulatorkali();
        
        //Menghitung hasil operasi
        int hasilKurang = kalkulatorKurang.kurang(10, 5);
        int hasilBagi = kalkulatorBagi.bagi(10, 2);
        int hasilKali = kalkulatorKali.kali(10, 5);
        
        //Menampilkan hasil output
        System.out.println("Hasil pengurangan: " + hasilKurang);
        System.out.println("Hasil pembagian: " + hasilBagi);
        System.out.println("Hasil perkalian: " + hasilKali);
    }
}