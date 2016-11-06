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
public class Microbuses extends Vehiculos  {

    public Microbuses(int IdMatricula, String Tipo) {
        super(IdMatricula, Tipo);
    }
    
    public double calcularPrecioMicrobus(int dia, int plaza   )   {

    int preciobase = 50;
    
    
    return preciobase  * dia +(1.50 * dia) + (2 * plaza);
    
    

}
    
    
}
