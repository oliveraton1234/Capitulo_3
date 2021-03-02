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
public class painCalculator {
    private Integer largo;
    private Integer ancho;
    private Integer alto;
    private Integer area;
    private Double galones;
    private Double precio;

    public painCalculator(Integer largo, Integer ancho, Integer alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.area = (2 * largo * alto) + (2 * ancho * alto);
        this.galones = (double)this.area / 350;
        this.precio = this.galones * 32;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public Integer getArea() {
        return area;
    }

    public Double getGalones() {
        return galones;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
    public String needGal(){
        return String.format("Se necesitan %.2f galones.", galones);
    }
    
    public String finalPrice(){
        return String.format("Costo total: %.2f", precio);
    }    
}
