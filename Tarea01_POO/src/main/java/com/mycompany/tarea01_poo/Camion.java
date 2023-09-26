/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Camion extends Transporte_Terrestre{
    private String Tipo_Cabina;
    private int Ruedas_Adicionales;
    
    public Camion(){
        this.Tipo_Cabina="";
        this.Ruedas_Adicionales=0;
    }

    public Camion(String ID_transporte, String Empresa_Asociada, String Marca, String color, String Num_Llantas, String Permiso_Circulacion, String Tipo_Combustible, String Tipo_Cabina, int Ruedas_Adicionales) {
        super(ID_transporte, Empresa_Asociada, Marca, color, Num_Llantas, Permiso_Circulacion,Tipo_Combustible);
        this.Tipo_Cabina = Tipo_Cabina;
        this.Ruedas_Adicionales = Ruedas_Adicionales;
    }

    public String getTipo_Cabina() {
        return Tipo_Cabina;
    }

    public void setTipo_Cabina(String Tipo_Cabina) {
        this.Tipo_Cabina = Tipo_Cabina;
    }

    public int getRuedas_Adicionales() {
        return Ruedas_Adicionales;
    }

    public void setRuedas_Adicionales(int Ruedas_Adicionales) {
        this.Ruedas_Adicionales = Ruedas_Adicionales;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de cabina: "+ this.getTipo_Cabina()
                +"\nRuedas adcionales: "+ this.getRuedas_Adicionales();
    }
}
