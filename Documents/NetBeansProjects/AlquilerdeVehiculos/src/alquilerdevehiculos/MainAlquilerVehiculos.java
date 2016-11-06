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
    
     
     
         
         
     for (Vehiculos p : cars) {
         
            
             if (p instanceof Coche) {
                Coche c = (Coche) p;
                
                System.out.println("Que Matricula de vehiculos Quieres?");
                c.setIdMatricula(444);
                
                System.out.println("Cuantos dias quieres el coche?");
                c.setDias(3);
                
                System.out.println("Para alquilar el vehiculo con Matricula "+ c.getIdMatricula() +" para "+  c.getDias() + " dias,el total es: "+c.calcularPreciocoche(3, 2));
   
             } 
                
                if (p instanceof Microbuses) {
                Microbuses c = (Microbuses) p;
                
                
                
               System.out.println("Que Matricula de vehiculos Quieres?");
                c.setIdMatricula(333);
                
                System.out.println("Cuantos dias quieres el coche?");
                c.setDias(2);
                
                System.out.println("Para alquilar el vehiculo con Matricula "+ c.getIdMatricula() +" para "+  c.getDias() + " dias,el total es: "+c.calcularPrecioMicrobus(2, 1));
            }
            
                
                
                
                
                if (p instanceof VehiculodeCarga) {
                VehiculodeCarga e = (VehiculodeCarga) p;
                 System.out.println("Que Matricula de vehiculos Quieres?");
                e.setIdMatricula(222);
                
                System.out.println("Cuantos dias quieres el coche?");
                e.setDias(1);
                
                System.out.println("Para alquilar el vehiculo con Matricula "+ e.getIdMatricula() +" para "+  e.getDias() + " dias,el total es: "+e.calcularPrecioVehiculodeCarga(1, 1, 5, "Normal"));
            }
            
               if (p instanceof VehiculodeCarga) {
                VehiculodeCarga e = (VehiculodeCarga) p;
                 System.out.println("Que Matricula de vehiculos Quieres?");
                e.setIdMatricula(111);
                
                System.out.println("Cuantos dias quieres el coche?");
                e.setDias(1);
                
                System.out.println("Para alquilar el vehiculo con Matricula "+ e.getIdMatricula() +" para "+  e.getDias() + " dias,el total es: "+e.calcularPrecioVehiculodeCarga(1, 1, 5, "Camion"));
            } 

             } 
  
  
}
  
  
  
  
}
    
