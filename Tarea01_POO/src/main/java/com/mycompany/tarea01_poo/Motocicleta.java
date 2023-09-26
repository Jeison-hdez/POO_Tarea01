/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Motocicleta extends Transporte_Terrestre{
    private String Tipo_Moto;
    private String Seguro;
    
    public Motocicleta(){
        this.Tipo_Moto="";
        this.Seguro="";
    }

    public Motocicleta(String ID_transporte, String Empresa_Asociada, String Marca, String color, String Num_Llantas, String Permiso_Circulacion, String Tipo_Combustible, String Tipo_Moto, String Seguro) {
        super(ID_transporte, Empresa_Asociada, Marca, color, Num_Llantas, Permiso_Circulacion,Tipo_Combustible);
        this.Tipo_Moto = Tipo_Moto;
        this.Seguro = Seguro;
    }

    public String getTipo_Moto() {
        return Tipo_Moto;
    }

    public void setTipo_Moto(String Tipo_Moto) {
        this.Tipo_Moto = Tipo_Moto;
    }

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String Seguro) {
        this.Seguro = Seguro;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de moto: "+ this.getTipo_Moto()
                +"\nSeguro: "+ this.getSeguro();
    }
}
