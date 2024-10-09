/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;

/**
 *
 * @author diana
 */
public class Pertemuan16soal2 {

    public static void main(String[] args) {
       double a = 9.5;
        double b = 2.5;
        
         operasiaritmatika[] operasi = new operasiaritmatika[]{
            new penjumlahan(a, b),
            new pengurangan(a, b),
            new perkalian(a, b),
            new pembagian(a, b)
         };
         
         // Menampilkan hasil operasi
        for (operasiaritmatika op : operasi) {
            try {
                System.out.println(op.getClass().getSimpleName() + ": " + op.hitung());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}