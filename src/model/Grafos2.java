/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
//import model.Grafo;

/**
 *
 * @author casa
 */
public class Grafos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Grafo gr = Grafo.getInstance();
        // gr.importarArquivo("arquivoGrafo.txt");
      
       System.out.println("--------------------------------------------------------------------------------");
       
        gr.addVertice("A","banco");
        gr.addVertice("B","banco");
         gr.addVertice("C","Cruzamento");
        gr.addVertice("D","estacionamento");
         gr.addVertice("E","banco");
        gr.addVertice("N","banco");
        gr.addVertice("I","banco");
     
        gr.imprimirVertices();
        gr.addAresta("A", "B", 6);
        gr.addAresta("A", "D", 4);

        gr.addAresta("B", "C", 10);
        gr.addAresta("B", "D", 7);
        gr.addAresta("B", "E", 7);

        gr.addAresta("C", "D", 8);
        gr.addAresta("C", "N", 6);
        gr.addAresta("C", "E", 5);
        gr.addAresta("C", "I", 3);

        gr.addAresta("N", "E", 7);
        gr.addAresta("D", "E", 12);
        System.out.println("-----------------------------------------------------");
        gr.imprimir();
    
        System.out.println("-----------------------------------------------------");
        //gr.calcularRota("I", "N");

        System.out.println("-----------------------------------------------------");

        gr.imprimir();
        gr.imprimirVertices();
        System.out.println("-----------------------------------------------------");
        System.out.println("alterei estacionamento");
        
        System.out.println("----------------------------------------------------- 2x");
        gr.calcularRota("N","A");
         
  
        System.out.println("------------"+gr.getRota());
        gr.imprimir();
        System.out.println("----------------------------------------------------- 44x");
        gr.calcularRota("N","E");
         
  
        System.out.println("------------"+gr.getRota());
    }

}
