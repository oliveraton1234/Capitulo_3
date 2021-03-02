/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;

/**
 *
 * @author Admin
 */
public class Salary {
    void calcularSalario(double paga, int horas, int extras){
        double salario = horas*paga+((paga*1.5)*extras);      
        System.out.println("La paga semanal de la persona es de: "+salario+" por "+extras+" horas extras.");
    }
}
