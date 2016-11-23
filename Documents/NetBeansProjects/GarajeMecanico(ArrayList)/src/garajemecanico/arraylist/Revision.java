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
public class Revision extends Trabajos {

    public Revision(){
        
        
    }
    
    
    public Revision(int IdTrabajo, String TrabajoDescripcion, int horas, int costedePieza) {
        super(IdTrabajo, TrabajoDescripcion, horas, costedePieza);
    }
    
    public double PrecioRevision(double horas) {
    double precio;
    
    precio = 20 + (horas * 30);
        return precio;
    }
    
    
}
