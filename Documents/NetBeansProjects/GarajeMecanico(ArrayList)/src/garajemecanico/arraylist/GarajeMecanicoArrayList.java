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
public class GarajeMecanicoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Trabajos A = new Trabajos(0,"Esta roto una ventana",0);
        Trabajos B = new Trabajos(1,"Esta roto la rueda",0);
        Trabajos C = new Trabajos(3,"Esta roto la puerta",0);
        
        
List<Trabajos> works = new ArrayList<>();
    
    
    works.add(A);
    works.add(B);
    works.add(C);
    


    }
    
}
