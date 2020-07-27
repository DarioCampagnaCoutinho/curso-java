package com.java.modulo04.vetores.exercicios;

/*
 * Exercicío 17, nova forma para inverter o vetor.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio17 {

    public static void main(String[] args)
    {
        int [] numeros ={0,1,2,3,4,5,6,7,8,9};

        int [] numerosInvertido = new int [numeros.length];

        int j = 0;
        for(int i = numeros.length-1; i > 0;i--){
            numerosInvertido[j]= numeros[i];
            j++;
        }

        for(int v : numerosInvertido){
            System.out.println(v);

        }

    }
}
