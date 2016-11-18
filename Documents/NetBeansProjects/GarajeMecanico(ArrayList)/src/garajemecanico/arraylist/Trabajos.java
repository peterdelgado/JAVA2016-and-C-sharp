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
public class Trabajos {
    
    private static int counter = 0;
    private int IdTrabajo;
    String TrabajoDescripcion;
    private int horas;
    private static int contador = 0;
    
    
    public Trabajos() {
    TrabajoDescripcion = "";
    IdTrabajo = 0;
    horas = 0;
}

    public Trabajos(int IdTrabajo, String TrabajoDescripcion, int horas) {
        counter++;
        
        this.IdTrabajo = counter;
        this.TrabajoDescripcion = TrabajoDescripcion;
        this.horas = horas;
    }

    public int getIdTrabajo() {
        return IdTrabajo;
    }

    public void setIdTrabajo() {
        
        this.IdTrabajo = IdTrabajo;
    }

    public String getTrabajoDescripcion() {
        return TrabajoDescripcion;
    }

    public void setTrabajoDescripcion(String t) {
        this.TrabajoDescripcion = TrabajoDescripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
       
       
        this.horas = horas;
        
    }

    @Override
    public String toString() {
        return "Trabajos{" + "IdTrabajo=" + IdTrabajo + ", TrabajoDescripcion=" + TrabajoDescripcion + ", horas=" + horas + '}';
    }

    
    
}
