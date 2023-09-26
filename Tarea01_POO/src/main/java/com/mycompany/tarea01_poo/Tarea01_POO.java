/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea01_poo;

/**
 *
 * @author jeiso
 */
public class Tarea01_POO {

    public static void main(String[] args) {
        Automovil au1 = new Automovil("JFH-164", "DEMASA", "Nissan", "blanco", "4 llantas", "al dia", "disel", 4, "al dia", "tracera", "automatico");
        System.out.println("Información de Automovil 1:");
        System.out.println(au1);
        
        System.out.println("");
        System.out.println("");
        
        
        Motocicleta mo1 = new Motocicleta("456-158","UberEats","Yamaha","Roja","2 llantas","al dia","Regular","Scoter","Ampliado");
        System.out.println("Información de Motocicleta 1:");
        System.out.println(mo1);
        
        System.out.println(""); 
        System.out.println("");
        
        
        Camion ca1 = new Camion("JLD-187","Coca Cola","Mercedes Benz","Negro","6 llantas","al dia","Gasolina","Cabina-dormitorio",2);
        System.out.println("Información de Camion 1:");
        System.out.println(ca1);
        
        System.out.println("");
        System.out.println("");
        
        
        Velero ve1 = new Velero("5-DE-7-WD-54","Ninguna","BALI","Blanco","150 kilos","Costa Rica","Tradicional","3 metros de largo, 40 cm de ancho");
        System.out.println("Información de Velero:");
        System.out.println(ve1);
       
        System.out.println("");
        System.out.println("");
        
        
        Barco_de_carga bc1 = new Barco_de_carga("9-CE-S-VR-65","APM Terminals Central América S.A.","HMM Algeciras","Blanco, azul y rojo","500 Toneladas","E.E.U.U",200,"Bienes primos");
        System.out.println("Información de Barco de carga 1:");
        System.out.println(bc1);
    }
}
