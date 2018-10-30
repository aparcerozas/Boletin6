/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author aparcerozas
 * 
 */
public class Persona {
    private String nombre;
    private double peso;
    
    public Persona(){}
    public Persona(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    public String getNombre(){
        return nombre;
    }
}
