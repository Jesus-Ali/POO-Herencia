/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, boolean encendido) {
        super(fabricante, numeroSerie, marca, nombre);
        this.encendido = encendido;
    }
    
    public boolean isEncendido() {
        return encendido;
    }
    
    public void encender(){
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nencendido=" + encendido;
    }
    
}
