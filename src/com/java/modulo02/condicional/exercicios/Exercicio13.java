package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 13, verifica o maior e menor dos três números.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio13 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int primeiro, segundo, terceiro;

        System.out.println("Primeiro Número = ");
        primeiro = input.nextInt();

        System.out.println("Segundo Número = ");
        segundo = input.nextInt();

        System.out.println("Terceiro Número = ");
        terceiro = input.nextInt();

        if(primeiro >= segundo && primeiro >= terceiro){
            System.out.println("O primeiro número é o maior. O número digitado é = " + primeiro);
        }else if(segundo >= primeiro && segundo >= terceiro){
            System.out.println("O segundo número é o maior. O número digitado é = " + segundo);
        }else{
            System.out.println("O terceiro número é o maior. O número digitado é = " + terceiro);
        }

        if(primeiro <= segundo && primeiro <= terceiro){
            System.out.println("O primeiro número é o menor. O número digitado é = " + primeiro);
        }else if(segundo <= primeiro && segundo <= terceiro){
            System.out.println("O segundo número é o menor. O número digitado é = " + segundo);
        }else{
            System.out.println("O terceiro número é o menor. O número digitado é = " + terceiro);
        }
        
        input.close();
    }
}
