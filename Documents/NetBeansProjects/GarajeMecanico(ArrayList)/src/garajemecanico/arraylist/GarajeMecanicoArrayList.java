
package garajemecanico.arraylist;
import static garajemecanico.arraylist.InputData.pedirEntero;
import static garajemecanico.arraylist.InputData.pedirEnteroCostedeFinal;
import static garajemecanico.arraylist.InputData.pedirEnteroCostedePieza;
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
      
    ReparacionesMecanicas A = new ReparacionesMecanicas(0,"RepM, no sirve nada",2,5,true,0);
    ReparaciondeChapayPintura B = new ReparaciondeChapayPintura(0,"RepCyP, Esta roto la rueda",0,0,true,0);
    Revision C = new Revision(0,"Rev,Esta roto la puerta",0,4,true,0);
    Revision D = new Revision(0,"TEST", 0,0,true,0);
    ReparaciondeChapayPintura E = new ReparaciondeChapayPintura(0,"OtroTest", 0,0,true,0);
    
    
     
    
    
    List<Trabajos> works = new ArrayList<>();

    works.add(A);
    works.add(B);
    works.add(C);
    works.add(D);
    works.add(E);
    
   for (Trabajos t : works) {
System.out.println("Trabajos Actual: IdTrabajos:"+ t.getIdTrabajo()+ " Detalle: "+ t.getTrabajoDescripcion()+ " Horas: "+ t.getHoras() + "Coste de Pieza" + t.getCostedePieza());
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
    works.add(new ReparacionesMecanicas(0,f,0,0,true,0));
    tr.close();
    break;
    
      
      }

            
      
    
    
    if (p.equals("Revision")){
        
        System.out.println("Los detalles?");
        BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
        
        String f=(tr.readLine());
        Revision w = new Revision(0,f,0,0,true,0);
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
   double newhoras = Integer.parseInt(br.readLine());
   Trabajos d = new Trabajos();
   Trabajos oldhoras = works.get(l-1);
   double ok = ((double)oldhoras.getHoras()) + newhoras;
   
   System.out.println("Horas anteriores:"+(double)oldhoras.getHoras());
   System.out.println("Horas nuevas:" + newhoras);  
   System.out.println("Total de horas"+ok);
     
   d.setHoras(ok);
   works.set(l-1,d);
   break;                                
    
    
    case "c":

    int m = pedirEnteroCostedePieza("Cual es el numbero de Trabajo?");
    
    BufferedReader rz = new BufferedReader(new InputStreamReader(System.in));   
    System.out.println("Cuanto quieres aumentar?"); 
    
    int costedePieza = Integer.parseInt(br.readLine());
    Trabajos c = new Trabajos();
    Trabajos oldcoste = works.get(m-1);
    double okey = ((Double)oldcoste.getCostedePieza()) + costedePieza;
    c.setCostedePieza(okey);
    works.set(m,c);
    break;
        
        
    case "d":
        
    int s = pedirEnteroCostedeFinal("Finalizar Trabajo, que es el numero del Trabajo?");
    
    Trabajos finalhoras = works.get(s-1);
    double finalhours = ((Double)finalhoras.getHoras());
    
    Trabajos finalpiezas = works.get(s-1);
    double finalpieces = ((Double)finalpiezas.getCostedePieza());
    
    Trabajos finaljob = works.get(s-1);
    String trabajofinal = ((String)finaljob.getTrabajoDescripcion());   
    
    System.out.println("TEST"+trabajofinal);
    
    
    if (trabajofinal.contains("RepM")){
    
        System.out.println ("El precio final de tu trabajo es  "+ A.PrecioReparacionesMecanicas(finalhours,finalpieces)+ "euros");
        
        Trabajos cierraTrabajo = works.get(s-1);
       
        boolean finish = cierraTrabajo.isFinish();
        
        Trabajos preciofinal = works.get(s-1);
        
        preciofinal.setPreciofinal(A.PrecioReparacionesMecanicas(finalhours,finalpieces));
        
    
        Trabajos closeJob = works.get(s-1);
                
        double finishpublico = ((double)closeJob.getPreciofinal());
    
        System.out.println(finishpublico);
        
        
        
    }
          
    if (trabajofinal.contains("Rev")){
    
        System.out.println ("El precio final de tu trabajo es  "+ C.PrecioRevision(finalhours)+ "euros");
        
        Trabajos cierraTrabajo = works.get(s-1);
       
        boolean finish = cierraTrabajo.isFinish();
        
        
    }
          
    if (trabajofinal.contains("RepCyP")){
    
        System.out.println ("El precio final de tu trabajo es  "+ E.PrecioReparacionesChapayPintura(finalhours,finalpieces)+ "euros");
        
        Trabajos cierraTrabajo = works.get(s-1);
       
        boolean finish = cierraTrabajo.isFinish();
        
        Trabajos closeJob = works.get(s-1);
        
        String finishpublico = ((String)closeJob.setTrabajoDescripcion("Finalizado!"));
    
        
        
    }
       
    case "E":
         int o  = pedirEntero("Que Trabajo quieres ver?");
        
          
        Trabajos finalId = works.get(o-1);
        
        int finishId = ((Integer)finalId.getIdTrabajo());
        
        Trabajos finaldescrip = works.get(o-1);
                
        String finallythend = ((String)finaldescrip.getTrabajoDescripcion());          
        
        Trabajos finalprice = works.get(o-1);
        double preciofinal = ((double)finalprice.getPreciofinal());
        
        System.out.println("IdTrabjo:"  + finishId    +"Descripcion:" + finallythend + "Precio Final:" + preciofinal);
   
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
         
      
        System.out.println("Trabajos Actual: IdTrabajos:"+ t.getIdTrabajo()+ " Detalle: "+ t.getTrabajoDescripcion()+ " Horas: " + t.getHoras()+   "Coste de Pieza " + t.getCostedePieza() + "Precio final:" + t.getPreciofinal());
     }
    
    
    
       
    }
     





}
    
    


    
    
    
    
    
    
  
   
    
    
    

