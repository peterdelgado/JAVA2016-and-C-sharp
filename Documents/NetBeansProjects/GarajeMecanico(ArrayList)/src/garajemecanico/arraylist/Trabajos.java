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
public  class Trabajos {
    
    private static int counter = 0;
    private int IdTrabajo;
    String TrabajoDescripcion;
    private double horas;
    private double costedePieza;
    private boolean finish;
    
    
    public boolean isFinish() {
        return false;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    
    
    
    public Trabajos() {
    TrabajoDescripcion = "";
    IdTrabajo = 0;
    horas = 0.0;
    costedePieza = 0.0;
    
    }

    public double getCostedePieza() {
        return costedePieza;
    }

    public void setCostedePieza(double costedePieza) {
        this.costedePieza = costedePieza;
    }

    public Trabajos(int IdTrabajo, String TrabajoDescripcion, double horas, double costedePieza,boolean finish) {
        counter++;
        
        this.IdTrabajo = counter;
        this.TrabajoDescripcion = TrabajoDescripcion;
        this.horas = horas;
        this.costedePieza = costedePieza;
        this.finish = finish;
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

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
       this.horas = horas;
        
    }

    @Override
    public String toString() {
        return "Trabajos{" + "IdTrabajo=" + IdTrabajo + ", TrabajoDescripcion=" + TrabajoDescripcion + ", horas=" + horas + ", costedePieza=" + costedePieza + '}';
    }

    

    
    
}
