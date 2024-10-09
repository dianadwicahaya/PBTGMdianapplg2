/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorpack;

/**
 *
 * @author diana
 */
public class 
        kalkulatorbagi {
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian tidak boleh nol.");
            
        }
        return a / b;
    }
}