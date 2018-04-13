/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mario
 */

public class Persona {
    String nombre;
    int edad;
    Direccion dir;

    public Persona(String nombre,int edad,String nombre2,int numero) {
        this.edad = edad;
        this.nombre = nombre;
        dir = new Direccion(nombre2,numero);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
