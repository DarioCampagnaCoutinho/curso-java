package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 12, alfabeto.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio12 {

    public static void main(String[] args)
    {
        System.out.println("Alfabeto!");

        char c = 'A';

        do {

            System.out.print(" " + c);
            c++;

        } while (c <= 'Z');
    }

}
