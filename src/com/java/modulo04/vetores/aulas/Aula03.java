package com.java.modulo04.vetores.aulas;

import java.util.Scanner;

/*
 * Aula 03, entrada de dados com vetores.
 *
 * */

public class Aula03 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double [] notas = new double[3];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite uma nota " + (i + 1) + " =");
            notas[i] = scan.nextDouble();
        }

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

    }
}
