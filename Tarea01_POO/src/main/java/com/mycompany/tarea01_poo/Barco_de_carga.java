/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Barco_de_carga extends Transporte_Maritimo{
    private int Max_Contenedores;
    private String Tipo_Mercancia;
    
    public Barco_de_carga(){
        this.Max_Contenedores=0;
        this.Tipo_Mercancia="";
    }

    public Barco_de_carga(String ID_transporte, String Empresa_Asociada, String Marca, String color, String MaxCapasidad_Peso, String Certificado_Origen, int Max_Contenedores, String Tipo_Mercancia) {
        super(ID_transporte, Empresa_Asociada, Marca, color, MaxCapasidad_Peso, Certificado_Origen);
        this.Max_Contenedores = Max_Contenedores;
        this.Tipo_Mercancia = Tipo_Mercancia;
    }

    public int getMax_Contenedores() {
        return Max_Contenedores;
    }

    public void setMax_Contenedores(int Max_Contenedores) {
        this.Max_Contenedores = Max_Contenedores;
    }

    public String getTipo_Mercancia() {
        return Tipo_Mercancia;
    }

    public void setTipo_Mercancia(String Tipo_Mercancia) {
        this.Tipo_Mercancia = Tipo_Mercancia;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nMaximo de contenedores: "+ this.getMax_Contenedores()
                +"\nTipo de mercancia: "+ this.getTipo_Mercancia();
    }
}
