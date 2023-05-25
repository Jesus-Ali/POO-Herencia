/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

/**
 *
 * @author Computacion
 */
public class Computadora extends DispositivoElectronicoDeConsumo{
    private Microprocesador cpu;
    private long ramMB;

    public Computadora(Microprocesador cpu, long ramMB, String fabricante, String numeroSerie, String marca, String nombre, boolean encendido) {
        super(fabricante, numeroSerie, marca, nombre, encendido);
        this.cpu = cpu;
        super.agregarComponente(cpu);
        this.ramMB = ramMB;
    }
    

    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    @Override
    public String toString() {
        return "\n\nCOMPUTADORA" + super.toString() + "\nramMB=" + ramMB;
    }
    
}
