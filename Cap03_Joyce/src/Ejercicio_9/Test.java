/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
     public static void main(String[] args) {
        Salary a = new Salary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca el pago por hora");
        double x = sc.nextDouble();
        System.out.println("Introzca las horas");
        int y = sc.nextInt();
        System.out.println("Introduzca las hotas extras");
        int z = sc.nextInt();
        a.calcularSalario(x,y,z);
    }
}
