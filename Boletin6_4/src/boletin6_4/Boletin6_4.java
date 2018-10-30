/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Pedro", 78.5);
        Persona p2 = new Persona("Marta", 64.2);
        if(p1.getPeso() > p2.getPeso()){
            System.out.println(p1.getNombre() + " pesa más que " + p2.getNombre());
            System.out.println("La diferencia de peso es de " + (p1.getPeso() - p2.getPeso()));
        }
        else{
            System.out.println(p2.getNombre() + " pesa más que " + p1.getNombre());
            System.out.println("La diferencia de peso es de " + (p2.getPeso() - p1.getPeso()));
        }
    }
    
}
