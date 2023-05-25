/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_p6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Computacion
 */
public class AppDemoHerencia {

    public static void main(String[] args) throws IOException {
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        generarDispositivos(listaDeSmartphones, listaDeTVs);
        mostrarDispositivos(listaDeSmartphones, listaDeTVs);
        MiFrame frame = new MiFrame();
        IUTelevision TV = new IUTelevision("television.JPG",listaDeTVs.get(0));
        IUPantalla pantalla = new IUPantalla("pantalla.JPG",listaDeTVs.get(0).getPantalla());
        IUSmartphone phone = new IUSmartphone("smartphone.JPG",listaDeSmartphones.get(0));
        IUSensor sensor = new IUSensor("sensor.JPG",listaDeSmartphones.get(0).getSensorDeHuella());
        frame.add(TV.getBoton());
        frame.add(pantalla.getBoton());
        frame.add(phone.getBoton());
        frame.add(sensor.getBoton());
        frame.mostrar();
    }
    
    public static void generarDispositivos(ArrayList<Smartphone> smartphones, ArrayList<Television> TV){
        smartphones.add(new Smartphone(new Sensor("Barometro","presion",100,"Cosmos","51","Paroscientific","Barometro"),new Pantalla(720,1280,"Samsung","700","Samsung","Pantalla OLED"),new Microprocesador(100,100,"Samsung","2200","Samsung","Exynos"),4000,"Samsung","22","Samsung","Galaxy",true));
        smartphones.add(new Smartphone(new Sensor("GPS","Posicion",100,"Teltonika","751","Teltonika","GPS"),new Pantalla(720,1280,"Samsung","700","Samsung","Pantalla OLED"),new Microprocesador(100,100,"Apple","16","Apple","Bionic"),4000,"Apple","14","Apple","IPhone 14",true));
        TV.add(new Television(new Pantalla(3840,2160,"Samsung","5590","Samsung","OLED TV"),"Samsung","5590","Samsung","Smart TV Neo QLED",true));
        TV.add(new Television(new Pantalla(3840,2160,"LG","5080","LG","LED TV"),"LG","5080","LG","Ulta HD 4K Smart TV",true));
    }
    
    public static void mostrarDispositivos(ArrayList<Smartphone> smartphones, ArrayList<Television> TV){
        System.out.println(Arrays.toString(smartphones.toArray()));
        System.out.println("--------------------------------------------------------------");
        System.out.println(Arrays.toString(TV.toArray()));
    }
}
