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
public class ReparacionesMecanicas extends Trabajos {
    
    
    
    public ReparacionesMecanicas() {
        
        
   }

   public ReparacionesMecanicas(int IdTrabajo, String TrabajoDescripcion, int horas, int costedePieza) {
   super(IdTrabajo, TrabajoDescripcion, horas, costedePieza);
        
          }
    
    public double PrecioReparacionesMecanicas(double horas, double costedePieza) {
    double precio;
    costedePieza = costedePieza * 1.1;
    precio = costedePieza + horas * 30;
        return precio;
    
}
}
