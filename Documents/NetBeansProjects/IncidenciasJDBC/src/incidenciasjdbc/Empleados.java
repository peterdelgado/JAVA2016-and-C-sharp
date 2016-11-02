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
public class Empleados {

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleados=" + idEmpleados + ", NombredeUsuario=" + NombredeUsuario + ", Contrasenya=" + Contrasenya + ", NombreCompleto=" + NombreCompleto + ", TelefonoContacto=" + TelefonoContacto + '}';
    }

    
    
    
    private int idEmpleados;
    private String NombredeUsuario;
    private String Contrasenya;
    private String NombreCompleto;
    private int TelefonoContacto;
    
    
    public Empleados(){
        
        NombredeUsuario = "";
        NombreCompleto = "";
        Contrasenya = "";
        
    }
            
    
    
    public Empleados(int idEmpleados, String NombredeUsuario, String Contrasenya, String NombreCompleto, int TelefonoContacto) {
        this.idEmpleados = idEmpleados;
        this.NombredeUsuario = NombredeUsuario;
        this.Contrasenya = Contrasenya;
        this.NombreCompleto = NombreCompleto;
        this.TelefonoContacto = TelefonoContacto;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombredeUsuario() {
        return NombredeUsuario;
    }

    public void setNombredeUsuario(String NombredeUsuario) {
        this.NombredeUsuario = NombredeUsuario;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(int TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }






}
