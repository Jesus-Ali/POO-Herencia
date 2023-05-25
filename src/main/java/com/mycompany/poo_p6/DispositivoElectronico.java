/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_p6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Computacion
 */
public class DispositivoElectronico {
    private String fabricante;
    private String numeroSerie;
    private String marca;
    private String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes  = new ArrayList<>();

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
    }
    

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }
    
    public void agregarComponente(ComponenteElectronico ce){
        componentes.add(ce);
    }
    
    public void quitarComponente(ComponenteElectronico ce){
        componentes.remove(ce);
    }

    @Override
    public String toString() {
        return "\nfabricante=" + fabricante + "\nnumeroSerie=" + numeroSerie + "\nmarca=" + marca + "\nnombre=" + nombre + "\ncosto=" + costo + "\ncomponentes=\n" + componentes;
    }
    
}
