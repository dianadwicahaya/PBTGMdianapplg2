/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6tugas1;

/**
 *
 * @author diana
 */
import java.util.Scanner; 

public class Pertemuan6tugas1 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
       System.out.println("Masukan NIM anda:");
 String nim = myInput.nextLine();
 System.out.println("Masukan Nama anda:");
 String nama = myInput.nextLine();
 System.out.println("Masukan Nilai anda:");
 int nilai = myInput.nextInt();
 // output input by user
 if(nilai>=60 && nilai<70){
 System.out.println("grade C ");
 }
 else if(nilai>=70 && nilai<80){
 System.out.println("grade B ");
 }
 else if(nilai>=80 && nilai<90){
 }
 System.out.println("grade A "); 
    }
}