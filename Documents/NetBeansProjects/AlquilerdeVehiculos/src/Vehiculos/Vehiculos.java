/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public abstract class Vehiculos {
    

    
    private int IdMatricula;
    private String Tipo;
    private int dias;
    
    public Vehiculos(){
        
        IdMatricula = 0;
       
        
        
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    

    public Vehiculos(int IdMatricula, String Tipo) {
        this.IdMatricula = IdMatricula;
        this.Tipo = Tipo;
        this.dias = dias;
    }

    public int getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(int IdMatricula) {
        this.IdMatricula = IdMatricula;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "IdMatricula=" + IdMatricula + ", Marca=" + Tipo + '}';
    }

    
}
