
package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 04, verifica o crescimento populacional das cidades A e B.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio04 {
    
    public static void main(String[] args){
        
        int populacaoCidadeA = 80000;
        int populacaoCidadeB = 200000;
        int contador = 0;
        
        while (populacaoCidadeA < populacaoCidadeB){
            
            populacaoCidadeA += (populacaoCidadeA/100) * 3;
            populacaoCidadeB += (populacaoCidadeB/100) * 1.5;
            contador++;
        }

        JOptionPane.showMessageDialog(null,"População A: " + populacaoCidadeA);
        JOptionPane.showMessageDialog(null,"População B: " + populacaoCidadeB);
        JOptionPane.showMessageDialog(null,"Qtd anos:     " + contador);
    }
}
