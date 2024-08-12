/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5tugas1;

/**
 *
 * @author diana
 */
import java.util.Scanner; // Import library class scanner

public class Pertemuan5tugas1 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
 System.out.println("Masukan Nama Anda:");
 String name = myInput.nextLine();
 System.out.println("Masukkan alamat anda");
 String address = myInput.nextLine();
 System.out.println("Masukan Usia Anda:");
 int age = myInput.nextInt();
 System.out.println("Masukan Gaji Anda:");
 double salary = myInput.nextDouble();
 // Output input by user
 System.out.println(" Nama: " + name);
 System.out.println("Alamat: " + address);
 System.out.println("Usia: " + age);
 System.out.println("Gaji: " + salary);
    }
}