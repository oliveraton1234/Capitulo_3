/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrse numero");
        int x = sc.nextInt();
        
        MetricConversion a = new MetricConversion(x);
        System.out.println(a.inchToCm());
        System.out.println(a.galToLt());
        
    }
    
}
