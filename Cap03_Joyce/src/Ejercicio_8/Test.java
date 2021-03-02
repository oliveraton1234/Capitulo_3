/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insurance a = new Insurance();
        
        System.out.println("Introduce el año");
        int x = sc.nextInt();
        System.out.println("Introduce fecha actual");
        int y = sc.nexInt();
        
        a.calcular(x, y);
    }
}
        
