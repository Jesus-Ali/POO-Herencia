/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Computacion
 */
public class MiFrame extends JFrame{
    public MiFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(648,648);
    }
    
    public void agregarBoton(JButton boton){
        this.add(boton);
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
}
