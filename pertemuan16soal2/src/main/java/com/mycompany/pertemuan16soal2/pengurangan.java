/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16soal2;

/**
 *
 * @author diana
 */
public class pengurangan extends operasiaritmatika{
    
    public pengurangan(double a, double b) {
        super(a, b);
    }
    
    @Override
    public double hitung() {
        return a - b;
    }
}