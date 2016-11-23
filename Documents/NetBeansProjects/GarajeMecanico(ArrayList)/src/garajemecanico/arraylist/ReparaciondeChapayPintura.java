/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajemecanico.arraylist;

/**
 *
 * @author pedro
 */
public class ReparaciondeChapayPintura extends Trabajos {

    
    
    public ReparaciondeChapayPintura(){
        
        
    }
    
    
    
    public ReparaciondeChapayPintura(int IdTrabajo, String TrabajoDescripcion, int horas, int costedePieza) {
        super(IdTrabajo, TrabajoDescripcion, horas, costedePieza);
    }
    
    public double PrecioReparacionesChapayPintura(double horas, double costedePieza) {
    double precio;
    costedePieza = costedePieza * 1.3;
    precio = costedePieza + (horas * 30);
        return precio;
    }
    
    
}
