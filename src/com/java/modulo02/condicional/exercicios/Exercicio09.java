package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 09, verifica se letra é uma vogal.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio09 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Entre com uma letra = ");
        letra = input.nextLine();

        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ||
                letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("Essa letra é uma vogal! ");
        }
        else{
            System.out.println("Essa letra é uma consoante! ");
        }
        
        input.close();
    }
}
