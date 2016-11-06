/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author pedro
 */
public class VehiculodeCarga extends Vehiculos {

    public VehiculodeCarga(int IdMatricula, String Tipo) {
        super(IdMatricula, Tipo);
    }
  
    public double calcularPrecioVehiculodeCarga(int dia, int plaza, int PMA, String t)   {

    int preciobase = 50;
    String p = "Camion";
    
    if (p.equals(t))   {
    
     return (preciobase * dia) + (20 * PMA) + 40;
    
    }  
    
    else 
    return (preciobase * dia) + (20 * PMA);
}    


}   

