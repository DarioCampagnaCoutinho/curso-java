package com.java.modulo08.oo.exercicios.exercicio08;

/**
 *
 * @author dario
 */
public class Main {

    public static void imprimirValor(){
        System.out.println(Contator.obterTamanho());
    }    

    public static void main(String[] args) {
        
                
        Contator.incrementar();
        Contator.incrementar();
        
        imprimirValor();
        
        Contator.zerar();
        
        imprimirValor();
        
        Contator contator1 = new Contator();
        Contator contator2 = new Contator();
        Contator contator3 = new Contator();

        imprimirValor();

    }
    
}
