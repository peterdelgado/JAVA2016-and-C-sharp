/*
 * Clase con los métodos de pedir datos de entrada por teclado
 * al usuario
 */
package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mfontana
 */
public class InputData {

    
    
//Crear un programa que pida los datos de dos alumnos, que son: nombre (letras), edad (entero) y altura (decimal). 
//Se debe realizar un control de la entrada de datos, de tal forma que si el usuario introduce n?meros en el nombre,
//o letras en la edad o la altura, se vuelva a pedir el dato correspondiente hasta que la entrada sea correcta.

    
    
    public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                cadena = br.readLine();
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            }
        } while (error);
        return cadena;
    }

    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un nº entero.");
                error = true;
            }
        } while (error);    // es lo mismo que error == true
        return numero;
    }

    public static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un número.");
                error = true;
            }
        } while (error);
        return numero;
    }
}
