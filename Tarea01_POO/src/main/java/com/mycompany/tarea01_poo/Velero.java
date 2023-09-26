/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Velero extends Transporte_Maritimo{
    private String Tipo_Velero;
    private String Tamaño;
    
    public Velero(){
        this.Tipo_Velero="";
        this.Tamaño="";
    }

    public Velero(String ID_transporte, String Empresa_Asociada, String Marca, String color, String MaxCapasidad_Peso, String Certificado_Origen, String Tipo_Velero, String Tamaño) {
        super(ID_transporte, Empresa_Asociada, Marca, color, MaxCapasidad_Peso, Certificado_Origen);
        this.Tipo_Velero = Tipo_Velero;
        this.Tamaño = Tamaño;
    }

    public String getTipo_Velero() {
        return Tipo_Velero;
    }

    public void setTipo_Velero(String Tipo_Velero) {
        this.Tipo_Velero = Tipo_Velero;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de velero: "+ this.getTipo_Velero()
                +"\nTamaño: "+ this.getTamaño();
    }
}
