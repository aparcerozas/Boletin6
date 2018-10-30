/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short num1, num2;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el primer número:"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el segundo número:"));
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Resta: " + (num1 - num2));
        }
        else{
            JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2));
        }
    }
    
}
