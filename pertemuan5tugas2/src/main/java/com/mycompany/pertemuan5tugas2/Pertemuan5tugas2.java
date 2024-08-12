/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5tugas2;

/**
 *
 * @author diana
 */
import java.util.Scanner; 

public class Pertemuan5tugas2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Alas: ");
 double alas = myInput.nextDouble();
 System.out.println("Tinggi: ");
 double tinggi = myInput.nextDouble();
 double luas = (alas*tinggi)/2;
 // output input by user
 System.out.println("Luas segitiga: " + luas);
    }
}