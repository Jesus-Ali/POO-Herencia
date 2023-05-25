/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class Television extends DispositivoElectronicoDeConsumo{
    private Pantalla pantalla;

    public Television(Pantalla pantalla, String fabricante, String numeroSerie, String marca, String nombre, boolean encendido) {
        super(fabricante, numeroSerie, marca, nombre, encendido);
        this.pantalla = pantalla;
        super.agregarComponente(pantalla);
    }
    

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "\n\nTELEVISION" + super.toString();
    }
    
}
