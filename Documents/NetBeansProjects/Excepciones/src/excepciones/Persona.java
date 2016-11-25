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
    private int altura;
    private int counter;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad  + ", message=" + message + ", altura=" + altura + '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    public Persona(){
        
         nombre = "";
         edad = 0;
         altura = 0;
    }
    
    
    public Persona(String nombre, int edad, int decimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.decimal = decimal;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    

    public int getEdad() {
        return edad;
    }

    

    
    
    
public void setNombre(String nombre) throws Excepciones, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        boolean error = false;
        do {
            try {
               System.out.println("Que es tu nombre?)");
                
                nombre = br.readLine();
                char c = nombre.charAt(0);
                if( Character.isDigit(c)){
                error = true;
                System.out.println("No numbers allowed!");
                counter++;
                        
                        
                        
                }
                else if (Character.isLetter(c)) {
                this.nombre = nombre;
                error = false;
                }

                
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
                counter++;
            } if (counter > 5){
                error= false;
                throw new Excepciones("More than 5 errors! Game over!");
            }  
                
        } while (error);
       
    
}
    
    public void setEdad(int edad) throws Excepciones, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        boolean error = false;
        do { System.out.println("Que es tu edad?)");
            try {
               edad = Integer.parseInt(br.readLine());
                if (edad > 120 || edad < 0) {
               counter++;
               throw new Excepciones("Edad incorrecta debe estar entre 0 y 120");
                
                }
                else  {
                this.edad = edad;
                error = false;
                
                }
             } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero.");
                error = true;
                 counter++;
            }if (counter > 5){
                error= false;
                throw new Excepciones("More than 5 errors! Game over!");
            }  
        } while (error);
       
    }
    
    public void setAltura(int altura) throws Excepciones, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        boolean error = false;
        do { System.out.println("Que es tu altura?)");
            try {
               if (altura > 120 || altura < 0) {
               throw new Excepciones("Edad incorrecta debe estar entre 0 y 120");
                }
               else { 
               
               altura = Integer.parseInt(br.readLine());
               this.altura = altura;
               error = false;
               } 
                
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero.");
                error = true;
                counter++;
            }if (counter > 5){
                error= false;
                throw new Excepciones("More than 5 errors! Game over!");
            }
            
            
        } while (error);
       
   
    }
    
   
  
} 
    

