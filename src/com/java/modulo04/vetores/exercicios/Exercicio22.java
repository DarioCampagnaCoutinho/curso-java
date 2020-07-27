package com.java.modulo04.vetores.exercicios;

import javax.swing.*;

/*
 * Exercicío 22, colocando 0, 1 e -1 no terceiro vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio22 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));

        int [] vetorA = new int [n];
        int [] vetorB = new int [vetorA.length];
        int [] vetorC = new int [vetorA.length];

        for(int i = 0; i < vetorA.length;i++){
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Elementos A " + (i + 1) + " :"));

        }

        for(int i = 0; i < vetorB.length;i++){
            vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Elementos B " + (i + 1) + " :"));

        }

        for(int i = 0; i < vetorB.length;i++){
            if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }else if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }else {
                vetorC[i] = -1;
            }
            System.out.println(vetorC[i]);

        }

    }
}
