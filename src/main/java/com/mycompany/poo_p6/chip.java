/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Chip extends Canvas {

    private BufferedImage image;

    public Chip() {
        try {
            // Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File("chip.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ver() {
        Chip canvas = new Chip();
        JFrame frame = new JFrame();
        JButton boton = new JButton(new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        boton.setBounds(10, 10, 50, 50);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("fuck you nigga bitch");
            }        JButton boton = new JButton(new ImageIcon("chip.JPG"));

        });
        frame.add(boton);
        frame.setSize(300, 300);
        frame.add(canvas);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
