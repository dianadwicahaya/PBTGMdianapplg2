/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16soal2;

/**
 *
 * @author diana
 */
public abstract class operasiaritmatika {
    
    protected double a;
    protected double b;
    
    // Construct untuk inisialisasi bilangan A dan B
    public operasiaritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    // Method abstract untuk operasi
    public abstract double hitung();
}