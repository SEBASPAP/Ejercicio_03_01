/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana2 extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;

    public Ventana2
        (String title) {
        super(title);
        this.setSize(300, 200);
        this.setLocation(650, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
     
        
    }
    public void iniciarPanel(){
        this.jPanel1 = new JPanel();
         this.jPanel1.setBackground(Color.MAGENTA);
         this.jPanel1.setBorder(BorderFactory.createTitledBorder("Principal Panel"));
         this.jPanel1.setLayout(new GridLayout(3,2));
          
    }
   
        public void iniciarEtiquetas(){
            this.jLabelList =new ArrayList<>();
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            
           
            this.jLabelList.get(0).setBackground(Color.LIGHT_GRAY);
            this.jLabelList.get(0).setOpaque(true);
            this.jLabelList.get(0).setText("           Button 1");
            this.jLabelList.get(1).setBackground(Color.GREEN);
            this.jLabelList.get(1).setOpaque(true);
            this.jLabelList.get(1).setText("                  2");
            this.jLabelList.get(2).setBackground(Color.ORANGE);
            this.jLabelList.get(2).setOpaque(true);
            this.jLabelList.get(2).setText("           Button 3");
            this.jLabelList.get(3).setBackground(Color.LIGHT_GRAY);
            this.jLabelList.get(3).setOpaque(true);
            this.jLabelList.get(3).setText("           Button 4");
            this.jLabelList.get(4).setBackground(Color.LIGHT_GRAY);
            this.jLabelList.get(4).setOpaque(true);
            this.jLabelList.get(4).setText("           Button 5");
            this.jPanel1.add(this.jLabelList.get(0));
            this.jPanel1.add(this.jLabelList.get(1));
            this.jPanel1.add(this.jLabelList.get(2));
            this.jPanel1.add(this.jLabelList.get(3));
            this.jPanel1.add(this.jLabelList.get(4));
        }
}
