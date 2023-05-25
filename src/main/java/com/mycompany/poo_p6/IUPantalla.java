/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Computacion
 */
public class IUPantalla extends JFrame{
    private String filename;
    private Pantalla pantalla;
    private Image imagen;
    private int posX = 220,posY = 190,width = 200,height = 200;

    public IUPantalla(String filename, Pantalla pantalla) throws IOException {
        this.filename = filename;
        this.pantalla = pantalla;
        imagen = ImageIO.read(new File(filename));
    }
    
    public JButton getBoton(){
        JButton boton = new JButton(new ImageIcon(imagen.getScaledInstance(width, height, Image.SCALE_DEFAULT)));
        boton.setBounds(posX, posY, width, height);
        boton.addActionListener((ActionEvent e) -> {
            System.out.println(pantalla.toString());
        });
        return boton;
    }
}