/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01_poo;

/**
 *
 * @author johan
 */
public class Transporte {
    private String ID_transporte;
    private String Empresa_Asociada;
    private String Marca;
    private String color;
    
    public Transporte(){
        this.ID_transporte="";
        this.Empresa_Asociada="";
        this.Marca="";
        this.color="";
    }

    public Transporte(String ID_transporte, String Empresa_Asociada, String Marca, String color) {
        this.ID_transporte = ID_transporte;
        this.Empresa_Asociada = Empresa_Asociada;
        this.Marca = Marca;
        this.color = color;
    }

    public String getID_transporte() {
        return ID_transporte;
    }

    public void setID_transporte(String ID_transporte) {
        this.ID_transporte = ID_transporte;
    }

    public String getEmpresa_Asociada() {
        return Empresa_Asociada;
    }

    public void setEmpresa_Asociada(String Empresa_Asociada) {
        this.Empresa_Asociada = Empresa_Asociada;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return "Indentificación: "+ this.getID_transporte()
                +"\nEmpresa asociada: "+ this.getEmpresa_Asociada()
                +"\nMarca : "+ this.getMarca()
                +"\nColor: "+ this.getColor();
    }
}
