/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Transporte_Terrestre extends Transporte{
    private String Num_Llantas;
    private String Permiso_Circulacion;
    private String Tipo_Combustible;
    
    public Transporte_Terrestre(){
        this.Num_Llantas="";
        this.Permiso_Circulacion="";
        this.Tipo_Combustible="";
    }

    public Transporte_Terrestre(String ID_transporte, String Empresa_Asociada, String Marca, String color, String Num_Llantas, String Permiso_Circulacion, String Tipo_Combustible) {
        super(ID_transporte, Empresa_Asociada, Marca, color);
        this.Num_Llantas = Num_Llantas;
        this.Permiso_Circulacion = Permiso_Circulacion;
        this.Tipo_Combustible = Tipo_Combustible;
    }

    public String getNum_Llantas() {
        return Num_Llantas;
    }

    public void setNum_Llantas(String Num_Llantas) {
        this.Num_Llantas = Num_Llantas;
    }

    public String getPermiso_Circulacion() {
        return Permiso_Circulacion;
    }

    public void setPermiso_Circulacion(String Permiso_Circulacion) {
        this.Permiso_Circulacion = Permiso_Circulacion;
    }

    public String getTipo_Combustible() {
        return Tipo_Combustible;
    }

    public void setTipo_Combustible(String Tipo_Combustible) {
        this.Tipo_Combustible = Tipo_Combustible;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nNumero de llantas: "+ this.getNum_Llantas()
                +"\nPermiso de circulación: "+ this.getPermiso_Circulacion()
                +"\nTipo de combustible: "+ this.getTipo_Combustible();
    }
}
