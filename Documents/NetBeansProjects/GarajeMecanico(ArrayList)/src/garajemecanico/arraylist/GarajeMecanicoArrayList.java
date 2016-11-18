/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajemecanico.arraylist;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class GarajeMecanicoArrayList  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    ReparacionesMecanicas A = new ReparacionesMecanicas(0,"Esta roto una ventana",0);
    ReparaciondeChapayPintura B = new ReparaciondeChapayPintura(1,"Esta roto la rueda",0);
    Revision C = new Revision(2,"Esta roto la puerta",0);
    Revision D = new Revision(3,"TEST", 0);
    ReparaciondeChapayPintura E = new ReparaciondeChapayPintura(0,"OtroTest", 0);
    
    
     
    
    
    List<Trabajos> works = new ArrayList<>();

    works.add(A);
    works.add(B);
    works.add(C);
    works.add(D);
    works.add(E);
    
   for (Trabajos t : works) {



    
  
    
    
    System.out.println("Trabajos Actual: IdTrabajos:"+ t.getIdTrabajo()+ " Detalle: "+ t.getTrabajoDescripcion()+ " Horas: "+ t.getHoras());
     }
    
    

    System.out.println("Que quieres hacer?");
    System.out.println("Command Options: ");
    System.out.println("a: Registrar Trabajo");
    System.out.println("b: Aumentar horas");
    System.out.println("c: Aumentar coste de pieza");
    System.out.println("d: Finaliza Trabajo");
    System.out.println("e: Muestra Trabajo");

    System.out.println("?: Display");
    System.out.println("q: Quit");


    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    
    do {
    switch (choice){
    case "a":
        
        
    System.out.println("Que tipo de Trabajo quieres registrar?");
    
    String p = scan.nextLine();
    if (p.equals("RepM")) {
     
     
    
    System.out.println("Los detalles?");
    Scanner can = new Scanner(System.in);
    
    
    String f = null;
    works.add(new ReparacionesMecanicas(0,f,0)); 
    break;
      
      
      }

            
      
    
    scan.close();
    
    
    
    
    
    
  
   
    
   
 
    
    if (p.equals("Revision")){
        
        System.out.println("Los detalles?");
    Scanner can = new Scanner(System.in);
    
    
    
        String f=(can.nextLine());
        Revision w = new Revision(0,f,0);
        works.add(w);
        scan.close();
        break;
        
    }
        
        
        
      
        
    
    break;
    case "b":
         
    System.out.println("Cual es el numbero de Trabajo?");
      
    int l = scan.nextInt();
      
    System.out.println("Cuantas horas quieres aumentar?"); 
    int horas = scan.nextInt();
    Trabajos d = new Trabajos();
    d.setHoras(horas);
    works.set(l,d);

      
    break;  
      
      
     
        
        
   
    case "?":
            System.out.println("Command Options: ");
            System.out.println("a: Registrar Trabajo");
            System.out.println("b: Aumentar horas");
            System.out.println("c: Aumentar coste de pieza");
            System.out.println("d: Finaliza Trabajo");
            System.out.println("e: Muestra Trabajo");
            System.out.println("?: Display");
            System.out.println("q: Quit");
            break;
        }  }while (choice == "");

 
    for (Trabajos t : works) {



    
  
    
    
    System.out.println("Trabajos Actual: IdTrabajos:"+ t.getIdTrabajo()+ " Detalle: "+ t.getTrabajoDescripcion()+ " Horas: "+ t.getHoras());
     }
    
    } 
    
    
  
    
}

    
    
    
    
    
    
  
   
    
    
    

