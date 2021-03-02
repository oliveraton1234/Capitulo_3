/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

/**
 *
 * @author Admin
 */
public class Sandwich {
    
    private String ingrediente;
    private String pan;
    private double precio;

    public Sandwich(String ingredient, String bread, double price) {
        this.ingrediente = ingredient;
        this.pan = bread;
        this.precio = price;
    }

    @Override
    public String toString() {
        return String.format("Sandwich de %s con pan de %s a $%.2f", ingrediente, pan, precio);
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
