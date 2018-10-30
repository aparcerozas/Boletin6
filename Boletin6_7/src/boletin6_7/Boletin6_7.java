/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double lado, base, altura, radio, area;
        final double PI = 3.14;
        do{
            
        opcion = Integer.parseInt(JOptionPane.showInputDialog
        ("Escolla unha das seguintes figuras xeométricas:\n1: Cadrado\n2: Triángulo\n3: Círculo\n\n0: Salir"));
        switch (opcion){
            case 1: lado = Double.parseDouble(JOptionPane.showInputDialog("Introduzca o lado do cadrado:"));
                    area = lado*lado;
                    JOptionPane.showMessageDialog(null, "Área do cadrado = " + area);
                    break;
            case 2: base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca a base do triángulo:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca a altura do triángulo:"));
                    area = base * altura;
                    JOptionPane.showMessageDialog(null, "Área do triángulo = " + area);
                    break;
            case 3: radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca o radio do círculo:"));
                    area = PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "Área do triángulo = " + area);
                    break;
            case 0: break;
            default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
                     break;
        }
        }while(opcion!=0);
    }
    
}
