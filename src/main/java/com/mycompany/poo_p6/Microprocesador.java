/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class Microprocesador extends ComponenteElectronico{
    private int cacheRAM;
    private long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "\nMICROPROCESADOR\ncacheRAM=" + cacheRAM + "\nvelocidadHz=" + velocidadHz + "\neste microprocesador " + super.toString();
    }
    
}
