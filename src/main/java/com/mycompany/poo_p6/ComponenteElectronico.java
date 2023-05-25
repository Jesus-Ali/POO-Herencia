/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class ComponenteElectronico extends DispositivoElectronico{
    
    private DispositivoElectronico esParteDe;

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        esParteDe = new DispositivoElectronico(fabricante, numeroSerie, marca, nombre);
    }

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "es Parte De " + esParteDe.getMarca();
    }
    
}
