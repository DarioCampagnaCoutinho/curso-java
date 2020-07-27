package com.java.modulo04.vetores.exercicios;

/*
 * Exercicío 23, invertendo um vetor.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio23 {

    public static void main(String[] args) {

        int [] vetorNormal = {1,2,3,4,5,6,7,8,9,10};
        int [] vetorInvertido = new int[vetorNormal.length];

        for(int i = 0;i < vetorNormal.length;i++){

            vetorInvertido[vetorNormal.length - i - 1] = vetorNormal[i];

        }

        for(int i = 0;i < vetorInvertido.length;i++){
            System.out.println(vetorInvertido[i]);
        }
    }
}
