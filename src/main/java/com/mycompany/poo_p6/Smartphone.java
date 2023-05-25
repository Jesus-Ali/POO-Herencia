/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class Smartphone extends Computadora{
    private Sensor sensorDeHuella;
    private Pantalla pantalla;

    public Smartphone(Sensor sensorDeHuella, Pantalla pantalla, Microprocesador cpu, long ramMB, String fabricante, String numeroSerie, String marca, String nombre, boolean encendido) {
        super(cpu, ramMB, fabricante, numeroSerie, marca, nombre, encendido);
        this.sensorDeHuella = sensorDeHuella;
        super.agregarComponente(sensorDeHuella);
        this.pantalla = pantalla;
        super.agregarComponente(pantalla);
    }
    
    
    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "\n\nSMARTPHONE" + super.toString();
    }
    
}
