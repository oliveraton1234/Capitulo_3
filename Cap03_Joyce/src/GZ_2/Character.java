/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GZ_2;

/**
 *
 * @author Admin
 */
public class Character {
    
     private String nombre;
    private Integer fuerza;
    private Integer vida;
    private String tipo;

    public Character() {
        this.nombre = "a";
        this.fuerza = 1;
        this.vida = 1;
        this.tipo = "a";
    }

    public Character(String nombre, Integer fuerza, Integer vida, String tipo) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Character{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", vida=" + vida + ", tipo=" + tipo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
