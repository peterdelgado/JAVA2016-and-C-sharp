/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadecontactos.hashmap;

/**
 *
 * @author pedro
 */
public class Contactos {
    
    private String Nombre;
    private int NumerodeTelefono;

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
            return 31;
             }
    
    @Override public boolean equals(Object obj) { 
        Country other = (Country) obj; 
        if (name.equalsIgnoreCase((other.name))) 
            return true; 
        return false; }

    
    
    
    
}
