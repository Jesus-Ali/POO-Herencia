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
public class IUMicroprocesador extends JFrame{
    private String filename;
    private Microprocesador microprocesador;
    private Image imagen;
    private int posX = 10,posY = 190,width = 200,height = 200;

    public IUMicroprocesador(String filename, Microprocesador microprocesador) throws IOException {
        this.filename = filename;
        this.microprocesador = microprocesador;
        imagen = ImageIO.read(new File(filename));
    }
    
    public JButton getBoton(){
        JButton boton = new JButton(new ImageIcon(imagen.getScaledInstance(width, height, Image.SCALE_DEFAULT)));
        boton.setBounds(posX, posY, width, height);
        boton.addActionListener((ActionEvent e) -> {
            System.out.println(microprocesador.toString());
        });
        return boton;
    }
}

