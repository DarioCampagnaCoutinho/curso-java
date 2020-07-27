package com.java.modulo04.vetores.exercicios;

/*
 * Exercicío 01, ordenação do vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio01 {

    public static void main(String [] args){

        int [] vetor = {2, 4, 9, 1, 10, 5, 7, 6, 8, 3};
        int aux = 0;

        for(int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] > vetor[j+1] ){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
