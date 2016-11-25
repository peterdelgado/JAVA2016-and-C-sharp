/*
 * Clase con los métodos de pedir datos de entrada por teclado
 * al usuario
 */
package garajemecanico.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author mfontana
 */
public class InputData {

    

    public static int pedirEntero(String mensaje) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 0;
        
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                l = Integer.parseInt(br.readLine());
                error = false;
           
            } 
            
            catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } 
            
            catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero entero.");
                error = true;
            }
        } while (error);    // es lo mismo que error == true
        return l;
    }

    public static int pedirEnteroCostedePieza(String mensaje) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                m = Integer.parseInt(br.readLine());
                error = false;
            } 
            
            catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } 
            
            catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero entero.");
                error = true;
            }
        } while (error);    // es lo mismo que error == true
        return m;
  
   }

public static int pedirEnteroCostedeFinal(String mensaje) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                s = Integer.parseInt(br.readLine());
                error = false;
            } 
            
            catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } 
            
            catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero entero.");
                error = true;
            }
        } while (error);    // es lo mismo que error == true
        return s;
  
   }




}
