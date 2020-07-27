package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 16, validando uma nota de 0 a 10.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean notaValida = false;
        do{
            System.out.println("Entre com uma nota valida:");
            double nota = scanner.nextDouble();
            if(nota >= 0 && nota <= 10){
                notaValida = true;
            }else{
                System.out.println("Digite Novamente!");
            }
        }while(!notaValida);
    }

}
