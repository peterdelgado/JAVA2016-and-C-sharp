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
public class Historial {
 
    
    private int idHistorial;
    private String NombredeUsuario;
    private String TipodeEvento;
    private String FechayHora;

    @Override
    public String toString() {
        return "Historial{" + "idHistorial=" + idHistorial + ", NombredeUsuario=" + NombredeUsuario + ", TipodeEvento=" + TipodeEvento + ", FechayHora=" + FechayHora + '}';
    }
    

    
    public Historial(){
        
        TipodeEvento = "";
        FechayHora = "";
        NombredeUsuario = "";
        
      
        
    }

    public Historial(int idHistorial, String NombredeUsuario, String TipodeEvento, String FechayHora) {
        this.idHistorial = idHistorial;
        this.NombredeUsuario = NombredeUsuario;
        this.TipodeEvento = TipodeEvento;
        this.FechayHora = FechayHora;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getNombredeUsuario() {
        return NombredeUsuario;
    }

    public void setNombredeUsuario(String NombredeUsuario) {
        this.NombredeUsuario = NombredeUsuario;
    }

    public String getTipodeEvento() {
        return TipodeEvento;
    }

    public void setTipodeEvento(String TipodeEvento) {
        this.TipodeEvento = TipodeEvento;
    }

    public String getFechayHora() {
        return FechayHora;
    }

    public void setFechayHora(String FechayHora) {
        this.FechayHora = FechayHora;
    }
    
    
    
    
            
    
} 
