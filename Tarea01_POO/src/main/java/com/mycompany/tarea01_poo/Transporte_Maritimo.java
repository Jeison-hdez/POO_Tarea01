/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Transporte_Maritimo extends Transporte{
    private String MaxCapasidad_Peso;
    private String Certificado_Origen;
    
    public Transporte_Maritimo(){
        this.MaxCapasidad_Peso="";
        this.Certificado_Origen="";
    }

    public Transporte_Maritimo(String ID_transporte, String Empresa_Asociada, String Marca, String color, String MaxCapasidad_Peso, String Certificado_Origen) {
        super(ID_transporte, Empresa_Asociada, Marca, color);
        this.MaxCapasidad_Peso = MaxCapasidad_Peso;
        this.Certificado_Origen = Certificado_Origen;
    }

    public String getMaxCapasidad_Peso() {
        return MaxCapasidad_Peso;
    }

    public void setMaxCapasidad_Peso(String MaxCapasidad_Peso) {
        this.MaxCapasidad_Peso = MaxCapasidad_Peso;
    }

    public String getCertificado_Origen() {
        return Certificado_Origen;
    }

    public void setCertificado_Origen(String Certificado_Origen) {
        this.Certificado_Origen = Certificado_Origen;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nMaxima capasidad de peso: "+ this.getMaxCapasidad_Peso()
                +"\nCertificado de origen: "+ this.getCertificado_Origen();
    }
}
