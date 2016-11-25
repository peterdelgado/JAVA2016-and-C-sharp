/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadecontactos.hashmap;

import java.util.HashMap;


/**
 *
 * @author pedro
 */
public class Contactos {
    
    private String Nombre;
    private int NumerodeTelefono;
    private String addContacto;
    private String removeContacto;
    private String replaceContacto;
    private String borrarContactos;

    public Contactos() {
    }
    
    public void clear(){
        
    }

   public String getAddContacto() {
        return addContacto;
    }

    public void setAddContacto(String addContacto) {
        this.addContacto = addContacto;
    }

    public void setRemoveContacto(String removeContacto) {
        this.removeContacto = removeContacto;
    }

    public String getReplaceContacto() {
        return replaceContacto;
    }

    public void setReplaceContacto(String replaceContacto) {
        this.replaceContacto = replaceContacto;
    }
    
    
    
    public Contactos(String Nombre, int NumerodeTelefono) {
        this.Nombre = Nombre;
        this.NumerodeTelefono = NumerodeTelefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumerodeTelefono() {
        return NumerodeTelefono;
    }

    public void setNumerodeTelefono(int NumerodeTelefono) {
        this.NumerodeTelefono = NumerodeTelefono;
    }

    @Override
    public String toString() {
        return "Contactos{" + "Nombre=" + Nombre + ", NumerodeTelefono=" + NumerodeTelefono + '}';
    }
    
    @Override public int hashCode() { 
           int result = 0;
            result = this.getNumerodeTelefono() / 100 + this.Nombre.length();
            return result;
             }
            
    
    
    
    @Override public boolean equals(Object obj) { 
        Contactos other = (Contactos) obj; 
        
        if (NumerodeTelefono == other.NumerodeTelefono){
            return true; 
        }
        else {
            return false; 
        }

    
    
    
    
}
}