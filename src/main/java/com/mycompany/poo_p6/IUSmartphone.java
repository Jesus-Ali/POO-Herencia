/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
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
public class IUSmartphone extends JFrame{
    private String filename;
    private Smartphone smartphone;
    private Image imagen;
    private int posX = 430,posY = 400,width = 200,height = 200;

    public IUSmartphone(String filename, Smartphone smartphone) throws IOException {
        this.filename = filename;
        this.smartphone = smartphone;
        imagen = ImageIO.read(new File(filename));
    }
    
    public JButton getBoton(){
        JButton boton = new JButton(new ImageIcon(imagen.getScaledInstance(width, height, Image.SCALE_DEFAULT)));
        boton.setBounds(posX, posY, width, height);
        boton.addActionListener((ActionEvent e) -> {
            System.out.println(smartphone.toString());
        });
        return boton;
    }
}
