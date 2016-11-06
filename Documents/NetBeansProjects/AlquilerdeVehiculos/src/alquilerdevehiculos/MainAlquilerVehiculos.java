/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerdevehiculos;

import Vehiculos.Coche;
import Vehiculos.Microbuses;
import Vehiculos.VehiculodeCarga;
import Vehiculos.Vehiculos;


import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;



/**
 *
 * @author pedro
 */
public class MainAlquilerVehiculos {

    public static void main(String[] args) {

    Coche C = new Coche(444,"Chevy");
    Microbuses M = new Microbuses(333, "Mercedes");
    VehiculodeCarga D = new VehiculodeCarga(222,"BMW");
    VehiculodeCarga F = new VehiculodeCarga(111, "Honda");

    List<Vehiculos> cars = new ArrayList<>();
    
    
    cars.add(C);
    cars.add(M);
    cars.add(D);
    cars.add(F); 
    
    for (Vehiculos t : cars) {
    System.out.println("Vehiculos en el Garage: "+t.getIdMatricula()+ " "+ t.getTipo());
     }
    
     System.out.println("Que matricula de Vehiculo quieres?");
     Scanner scanner = new Scanner(System.in);
     int p = scanner.nextInt();
     
     if (p == 444 ) {
     Coche c = new Coche(444,"Chevy");     
     
     System.out.println("Por cuantos dias?");
     Scanner nscanner = new Scanner(System.in);
     int dias = nscanner.nextInt();
         
         
     System.out.println( "Te va costar:" + c.calcularPreciocoche(dias, 3));
                 
                 
                 }      

    
     
     
     if (p == 333 ) {
     Microbuses c = new Microbuses(333,"Mercedes");     
     
     System.out.println("Por cuantos dias?");
     Scanner nscanner = new Scanner(System.in);
     int dias = nscanner.nextInt();
         
     System.out.println( "Te va costar:" + c.calcularPrecioMicrobus(dias, 1));
                 
                 
                 }     
         
     
         
     
     
     if (p == 222 ) {
     VehiculodeCarga x = new VehiculodeCarga(222,"BMW");     
     
     System.out.println("Por cuantos dias?");
     Scanner nscanner = new Scanner(System.in);
     int dias = nscanner.nextInt();
         
     System.out.println( "Te va costar:" + x.calcularPrecioVehiculodeCarga(dias, 2, 5, "Normal"));
             
     }        
   
                
    }          
  
}

  
  

    
