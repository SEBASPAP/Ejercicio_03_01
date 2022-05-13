/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_03_01;

/**
 *
 * @author paulp
 */
public class Ejercicio_03_01 {

    public static void main(String[] args) {
        var ventana1= new Ventana1("BorderLayout");
        ventana1.setVisible(true);
        
        var ventana2= new Ventana2("GridLayout");
        ventana2.setVisible(true);
        
        var ventana3 = new Ventana3("FlowLayout");
        ventana3.setVisible(true);
        
        var ventana4 = new Ventana4("BorderLayout");
        ventana4.setVisible(true);
    }
}
