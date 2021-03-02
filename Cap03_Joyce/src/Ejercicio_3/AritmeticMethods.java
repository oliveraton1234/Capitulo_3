/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;


/**
 *
 * @author Admin
 */
public class AritmeticMethods {
    private Integer a;
    private Integer b;

    public AritmeticMethods(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    
    public void displayNumberPlus10(){
        System.out.println(String.format("Numero 1: %d / Numero 2: %d", a + 10, b + 10));
    }
    
    public void displayNumberPlus100(){
        System.out.println(String.format("Numero 1: %d / Numero 2: %d", a + 100, b + 100));
    }
    
    public void displayNumberPlus1000(){
        System.out.println(String.format("Numero 1: %d / Numero 2: %d", a + 1000, b + 1000));
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }   
   
}
