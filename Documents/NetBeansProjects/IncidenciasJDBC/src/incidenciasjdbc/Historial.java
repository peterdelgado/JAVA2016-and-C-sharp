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
    private DBIncidencias Incidencias;
    private Empleados Empleados;
    private String TipodeEvento;
    private String FechayHora;
    private String EmpleadoUsuario;

    
    public Historial(){
        
        TipodeEvento = "";
        FechayHora = "";
        EmpleadoUsuario = "";
        
      
        
    }
    
    
    
    
    public Historial(int idHistorial, DBIncidencias Incidencias, Empleados Empleados, String TipodeEvento, String FechayHora, String EmpleadoUsuario) {
        this.idHistorial = idHistorial;
        this.Incidencias = Incidencias;
        this.Empleados = Empleados;
        this.TipodeEvento = TipodeEvento;
        this.FechayHora = FechayHora;
        this.EmpleadoUsuario = EmpleadoUsuario;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
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

    public String getEmpleadoUsuario() {
        return EmpleadoUsuario;
    }

    public void setEmpleadoUsuario(String EmpleadoUsuario) {
        this.EmpleadoUsuario = EmpleadoUsuario;
    }

    public DBIncidencias getIncidencias() {
        return Incidencias;
    }

    public void setIncidencias(DBIncidencias Incidencias) {
        this.Incidencias = Incidencias;
    }

    public Empleados getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(Empleados Empleados) {
        this.Empleados = Empleados;
    }
    
    
            
    
} 
