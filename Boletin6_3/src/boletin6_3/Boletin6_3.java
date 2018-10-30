/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
        if(num1 > 0)
            JOptionPane.showMessageDialog(null, "+");
        else if(num1 < 0)
            JOptionPane.showMessageDialog(null, "-");
        else
            JOptionPane.showMessageDialog(null, "0");
    }
    
}
