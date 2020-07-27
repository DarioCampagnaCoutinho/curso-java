package com.java.modulo04.vetores.aulas;

/*
 * Aula 02, trabalhando com indices dos vetores.
 *
 * */

public class Aula02 {

    public static void main(String [] args){

        double [] notas = new double[3];
        notas[0] = 7;
        notas[1] = 5;
        notas[2] = 7;

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

    }
}
