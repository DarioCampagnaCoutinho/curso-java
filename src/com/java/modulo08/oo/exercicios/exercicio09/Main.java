package com.java.modulo08.oo.exercicios.exercicio09;

/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        
        lampada.ligado();
        
        if(lampada.ligada){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
        }
        
        lampada.desligado();
        
         if(lampada.ligada){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
        }
    }
    
}
