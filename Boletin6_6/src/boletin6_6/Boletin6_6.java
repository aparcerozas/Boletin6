/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ventas;
        String artigo;
        ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca as ventas anuais:"));
        if(ventas > 1000){
            artigo = "primeira necesidade";
        }
        else if(ventas > 500 && ventas <= 1000){
            artigo = "alto";
        }
        else if(ventas > 100 && ventas <= 500){
            artigo = "medio";
        }
        else{
            artigo = "baixo";
        }
        JOptionPane.showMessageDialog(null, "O artigo de consumo é de tipo " + artigo);
    }
    
}
