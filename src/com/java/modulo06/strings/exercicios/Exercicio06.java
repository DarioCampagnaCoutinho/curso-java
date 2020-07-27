package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        String frase = "Hoje Temos aula de Projeto Integradfor";
        String palavra = "Temos";
        
        boolean igual = frase.contains(palavra);
        
        if(igual){
            JOptionPane.showMessageDialog(null, "Contem");
            JOptionPane.showMessageDialog(null, frase.indexOf(palavra));
        }else{
            JOptionPane.showMessageDialog(null, "Não");
        }
    }
    
}
