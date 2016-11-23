/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pedro
 */
public class Persona {
    private String nombre;
    private int edad;
    private int decimal;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    public Persona(){
        
        
        
    }
    
    
    public Persona(String nombre, int edad, int decimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.decimal = decimal;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }
    
    
//    public void setEdad(int edad) throws Excepciones {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean error = false;
//        do {
//            try {
////               if (edad > 120 || edad < 0) {
////               throw new Excepciones("Edad incorrecta debe estar entre 0 y 120");
////               
////               }
////               else { 
////               
////               this.edad = edad;
////               } 
//            } catch (IOException ex) {
//                System.out.println("Error entrada salida");
//                error = true;
//            } catch (NumberFormatException ex) {
//                System.out.println("No has introducido un numero.");
//                error = true;
//            }
//        } while (error);
//        
//    }
    
    public void setEdad(int edad) throws Excepciones {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error = false;
        do {
            try {
                if (edad > 120 || edad < 0) {
               throw new Excepciones("Edad incorrecta debe estar entre 0 y 120");
               
               }
               else { 
               
                numero = Double.parseDouble(br.readLine());
                error = false;
               } 
                
               
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un número.");
                error = true;
            }
        } while (error);
       this.edad = edad;
    }
    
    
    
    
  
} 
    

//if (edad > 120 || edad < 0) {
////               throw new Excepciones("Edad incorrecta debe estar entre 0 y 120");
////               
////               }
////               else { 
////               
////               this.edad = edad;
////               } 