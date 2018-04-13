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
public class Direccion {
    
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    private int numero;
    public int getnumero(){
        return numero;
        
    }
    public void setNumero(int numero){
        this.numero= numero ;
    }

    public Direccion(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
            
    
    
    
}
