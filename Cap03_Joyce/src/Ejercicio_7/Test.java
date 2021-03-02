/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

/**
 *
 * @author Admin
 */
public class Test {
     public static void main(String[] args) {
        painCalculator cuarto = new painCalculator(15, 20, 10);
        System.out.println(cuarto.needGal());
        System.out.println(cuarto.finalPrice());
    }
    
}
