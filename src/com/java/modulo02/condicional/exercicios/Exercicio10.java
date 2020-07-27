package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 10, verifica uma letra, se letra igual M ou m é masculino, se letra
 * é igual F ou f é feminino se não é letra inválida, usando switch case.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio10 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Entre com uma letra (F ou M) = ");
        letra = input.nextLine();

        if(letra.length() > 1){
            System.out.println("Letra é maior que um caracter!");
        } else {
            switch (letra) {
                case "f":
                case "F":
                    System.out.println("F - Feminino");
                    break;
                case "m":
                case "M":
                    System.out.println("M - Masculino");
                    break;
                default:
                    System.out.println("Letra Inválida");
            }
        }
        
        input.close();
    }
}
