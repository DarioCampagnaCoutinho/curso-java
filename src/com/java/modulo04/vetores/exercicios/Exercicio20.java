package com.java.modulo04.vetores.exercicios;

/*
 * Exercicío 20, vetor e palindromo.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio20 {

    public static void main(String[] args) {

        int vetor [] = {1, 2, 3, 4, 4, 3, 2, 0};

        int i = 0;
        int j = vetor.length - 1;

        boolean palindromo = true;

        while (i < j){
            if(vetor[i] != vetor[j]){
                palindromo = false;
                System.out.println("Não é palindromo!");
                break;

            }else {
                System.out.println("É palindromo!");
                break;
            }
        }

    }
}
