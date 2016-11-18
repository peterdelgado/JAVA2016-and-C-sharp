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
    public static int contador = 0;
    
    
    public ReparacionesMecanicas(String TrabajoDescripcion) {
        contador++;
        this.TrabajoDescripcion = TrabajoDescripcion;
   }

    
    public ReparacionesMecanicas(int IdTrabajo, String TrabajoDescripcion, int horas) {
        super(IdTrabajo, TrabajoDescripcion, horas);
        
          }
    
    public double PrecioReparacionesMecanicas(double horas, double costedePieza) {
    double precio;
    costedePieza = costedePieza * 1.1;
    precio = costedePieza + horas * 30;
        return precio;
    
}
}
