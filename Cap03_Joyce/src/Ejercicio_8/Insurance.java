/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;

/**
 *
 * @author Admin
 */
public class Insurance {
    
    void calcular(int nacimiento, int actual) {
        int edad = actual - nacimiento;
        int decada = (int) (edad / 10);
        System.out.println("Cotización es de: " + ((decada + 15) * 20));

    }

}
