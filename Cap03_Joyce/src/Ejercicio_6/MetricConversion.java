/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

/**
 *
 * @author Admin
 */
public class MetricConversion {
     private Integer valor;
    private final Double centimetros;
    private final Double litros;

    public MetricConversion(Integer valor) {
        this.valor = valor;
        this.centimetros = (double)valor * 2.54;
        this.litros = (double)valor * 3.7854;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public Double getCentimetros() {
        return centimetros;
    }

    public Double getLitros() {
        return litros;
    }
    
    public String inchToCm(){
        return String.format("%d in equivalen a %.3f cm.", valor, centimetros);
    }
    
    public String galToLt(){
        return String.format("%d gal equivalen a %.3f lts.", valor, litros);
    }
}
