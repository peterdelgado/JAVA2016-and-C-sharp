/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajemecanico.arraylist;
import static garajemecanico.arraylist.InputData.pedirEntero;
import java.util.ArrayList;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pedro
 */
public class GarajeMecanicoArrayList  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
    ReparacionesMecanicas A = new ReparacionesMecanicas(0,"RepM, Esta roto una ventana",2,0);
    ReparaciondeChapayPintura B = new ReparaciondeChapayPintura(0,"RepCyP, Esta roto la rueda",0,0);
    Revision C = new Revision(0,"Rev,Esta roto la puerta",0,0);
    Revision D = new Revision(0,"TEST", 0,0);
    ReparaciondeChapayPintura E = new ReparaciondeChapayPintura(0,"OtroTest", 0,0);
    
    
     
    
    
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

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String choice = br.readLine();
    
    do {
    switch (choice){
    case "a":
        
        
    System.out.println("Que tipo de Trabajo quieres registrar?");
    
    String p = br.readLine();
    if (p.equals("RepM")) {
     
     
    
    System.out.println("Los detalles?");
    BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
    String f=(tr.readLine());
    works.add(new ReparacionesMecanicas(0,f,0,0));
    tr.close();
    break;
    
      
      }

            
      
    
    
    if (p.equals("Revision")){
        
        System.out.println("Los detalles?");
        BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
        
        String f=(tr.readLine());
        Revision w = new Revision(0,f,0,0);
        works.add(w);
        tr.close();
        break;
        
    
        
    }
        
        
       
    break;
    case "b":
    
   
    boolean encontrado = false;

    int l  = pedirEntero("Cual es el numero de Trabajo?");
   
   
    
    
    if (works.size() >= l) {
    encontrado = true;
    
            }
    else {
    System.out.println("No Existe!");
    encontrado = false;
    
   
    
    }
     
    
    System.out.println("Cuantas horas quieres aumentar?"); 
//   El setHoras est? bien, lo que no est? bien es que t? pides cu?ntas horas quieres aumentar
//   pero no las aumentas sino que las sustituyes. Deber?as coger las horas que tiene ese trabajo, 
//   aumentarlas en la cantidad q indica el usuario y "setear" esas horas, me explico?
    int newhoras = Integer.parseInt(br.readLine());
    
    Trabajos d = new Trabajos();
    
    Trabajos oldhoras = works.get(l-1);
    
    int ok = ((Integer)oldhoras.getHoras()) + newhoras;
   
   System.out.println("Horas anteriores:"+(Integer)oldhoras.getHoras());
   System.out.println("Horas nuevas:" + newhoras);  
   System.out.println("Horas Totales");
     
   d.setHoras(ok);
   works.set(l-1,d);


    
    
    
    
    
 
    
  
    
   
    
      
    break;                                
    
    
    case "c":
        
    System.out.println("Cual es el numbero de Trabajo?");
    BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));  
    int m = rr.read();
    
    BufferedReader rz = new BufferedReader(new InputStreamReader(System.in));   
    System.out.println("Cuanto quieres aumentar?"); 
    int costedePieza = rz.read();
    
    Trabajos c = new Trabajos();
    c.setCostedePieza(costedePieza);
    works.set(m,c);
    break;
        
        
    case "d":
        
    System.out.println("Finaliza Trabajo ahora Calcular Precio");
    BufferedReader tt = new BufferedReader(new InputStreamReader(System.in));  
    System.out.println("Que Tipo de Trabajo?");
       
    String n = tt.readLine();
      
    if (n.equals("RepM")){
    ReparacionesMecanicas F = new ReparacionesMecanicas();
    System.out.println("Cuanto horas era el trabajo al final");
    int finalhoras = tt.read();
          
    System.out.println("Cuanto era el coste final de las piezas?");
    int finalpiezas = tt.read();
    
    System.out.println ("El precio final de tu trabajo es  "+ F.PrecioReparacionesMecanicas(finalhoras, finalpiezas)+ "euros");
          
      }
       
    if (n.equals("Revision")){
    Revision Z = new Revision();
          
    System.out.println("Cuanto horas era el trabajo al final");
          
          double finalhoras = tt.read();;
          
          System.out.println("Cuanto era el coste final de las piezas?");
          
          double finalpiezas = tt.read();
          
          System.out.println ("El precio final de tu trabajo es  "+ Z.PrecioRevision(finalhoras)+ "euros");
          
      }
       
       
       if (n.equals("RepCP")){
          
         ReparaciondeChapayPintura L = new ReparaciondeChapayPintura();
          
          System.out.println("Cuanto horas era el trabajo al final");
          double finalhoras = tt.read();
          
          
          System.out.println("Cuanto era el coste final de las piezas?");
          double finalpiezas = tt.read();
          
          
          System.out.println ("El precio final de tu trabajo es  "+ L.PrecioReparacionesChapayPintura(finalhoras,finalpiezas)+ "euros");
          
      }
       
       
       System.out.println("Coste de la piezas?");
       
       int costeFinaldePiezas = tt.read();
        
       
//       System.out.println("El coste final de tu Trabajo es" + );
        
   
    case "?":
            System.out.println("Command Options: ");
            System.out.println("a: Registrar Trabajo");
            System.out.println("b: Aumentar horas");
            System.out.println("c: Aumentar coste de pieza");
            System.out.println("d: Finaliza Trabajo");
            System.out.println("e: Muestra Trabajo");
            System.out.println("?: Display");
            System.out.println("q: Quit");
    }   break;
          }while (choice == "");
    
    
   
    for (Trabajos t : works){
         
      
        System.out.println("Trabajos Actual: IdTrabajos:"+ t.getIdTrabajo()+ " Detalle: "+ t.getTrabajoDescripcion()+ " Horas: "+ t.getHoras());
     }
    
    
    
       
    }
     





}
    
    


    
    
    
    
    
    
  
   
    
    
    

