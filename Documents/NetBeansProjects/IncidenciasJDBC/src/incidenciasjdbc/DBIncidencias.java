/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incidenciasjdbc;

/**
 *
 * @author pedro
 */
public class DBIncidencias {
    
  private int idIncidencias;
  private  String HorayFecha;
  private String Origen;
  private String Destino;
  private String Detalle;
  private String Tipo;

    
  public DBIncidencias(){
      
       HorayFecha = "";
       Origen = "";
       Destino = "";
       Detalle = "";
       Tipo = "";
      
  }
  
  
  
  
  public DBIncidencias(int idIncidencias, String HorayFecha, String Origen, String Destino, String Detalle, String Tipo) {
        this.idIncidencias = idIncidencias;
        this.HorayFecha = HorayFecha;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Detalle = Detalle;
        this.Tipo = Tipo;
    }

    public int getIdIncidencias() {
        return idIncidencias;
    }

    public void setIdIncidencias(int idIncidencias) {
        this.idIncidencias = idIncidencias;
    }

    public String getHorayFecha() {
        return HorayFecha;
    }

    public void setHorayFecha(String HorayFecha) {
        this.HorayFecha = HorayFecha;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
  



}
