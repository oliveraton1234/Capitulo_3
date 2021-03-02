/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_14;

/**
 *
 * @author Admin
 */
public class Painting {
     private String titulo;
    private String autor;
    private String medio;
    private Integer precio;
    private double comision;
    
    public Painting(){
        this.titulo = "a";
        this.autor = "a";
        this.medio = "a";
        this.precio = 0;
    }

    public Painting(String titulo, String autor, String medio, Integer precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.medio = medio;
        this.precio = precio;
        this.comision = (double)precio * 0.02;
    }

    @Override
    public String toString() {
        return "Painting{" + "titulo=" + titulo + ", autor=" + autor + ", medio=" + medio + ", precio=" + precio + ", comision=" + comision + '}';
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
        this.comision = (double)precio * 0.02;
    }

    public double getComision() {
        return comision;
    }    
}
