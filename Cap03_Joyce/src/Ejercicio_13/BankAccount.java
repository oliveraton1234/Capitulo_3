/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_13;

/**
 *
 * @author Admin
 */
public class BankAccount {
    private Integer cuenta;
    private String nombre;
    private double saldo;
    
    public BankAccount(){
        this.cuenta = 0000;
        this.nombre = "a";
        this.saldo = 0.00;
    }

    public BankAccount(Integer cuenta, String poseedor, double saldo) {
        this.cuenta = cuenta;
        this.nombre = poseedor;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        System.out.print("Cada mes se cobrara una tarifa $4");
        return "BankAccount{" + "cuenta=" + cuenta + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
