package com.java.modulo08.oo.exercicios.exercicio09;

/**
 *
 * @author dario
 */
public class Lampada {
    
    boolean ligada;
    
    public void ligado(){
        ligada = true;
    }
    
    public void desligado(){
        ligada = false;  
    }
    
    public void mostrar(){
       
        if(ligada){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
        }
    }
    
    public void mudarStatus(){
        if(ligada){
            desligado();
        }else{
            ligado();
        }
    }
}
