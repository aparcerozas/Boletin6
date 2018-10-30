/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, maior;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número:"));
        if(num1>num2){
            maior = num1;
            if(num3>num1){
                maior = num3;
            }
        }
        else{
            maior = num2;
            if(num3>num2){
                maior = num3;
            }
        }
        JOptionPane.showMessageDialog(null, "El número mayor es el " + maior);
    }
    
}
