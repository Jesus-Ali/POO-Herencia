/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class Pantalla extends ComponenteElectronico{
    private int resolucionX;
    private int resolucionY;

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }
    

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "\nPANTALLA\nresolucionX=" + resolucionX + "\nresolucionY=" + resolucionY + "\nesta pantalla " + super.toString();
    }
    
}
