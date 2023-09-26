/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Automovil extends Transporte_Terrestre {
    private int Num_Puertas;
    private String Riteve;
    private String Traccion;
    private String Transmision;
    
    public Automovil(){
        this.Num_Puertas=0;
        this.Riteve="";
        this.Traccion="";
        this.Transmision="";
    }

    public Automovil(String ID_transporte, String Empresa_Asociada, String Marca, String color, String Num_Llantas, String Permiso_Circulacion, String Tipo_Combustible, int Num_Puertas, String Riteve, String Traccion, String Transmision) {
        super(ID_transporte, Empresa_Asociada, Marca, color, Num_Llantas, Permiso_Circulacion, Tipo_Combustible);
        this.Num_Puertas = Num_Puertas;
        this.Riteve = Riteve;
        this.Traccion = Traccion;
        this.Transmision = Transmision;
    }

    public int getNum_Puertas() {
        return Num_Puertas;
    }

    public void setNum_Puertas(int Num_Puertas) {
        this.Num_Puertas = Num_Puertas;
    }

    public String getRiteve() {
        return Riteve;
    }

    public void setRiteve(String Riteve) {
        this.Riteve = Riteve;
    }

    public String getTraccion() {
        return Traccion;
    }

    public void setTraccion(String Traccion) {
        this.Traccion = Traccion;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nNumero de puertas: "+ this.getNum_Puertas()
                +"\nPermiso Rivete: "+ this.getRiteve()
                +"\nTipo de tracción: "+ this.getTraccion()
                +"\nTipo de transmision: "+ this.getTransmision();
    }
}
