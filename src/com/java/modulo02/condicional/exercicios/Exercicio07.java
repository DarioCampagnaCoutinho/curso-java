package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 07, verifica se um número é positivo.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio07 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int n1 = 0;

        System.out.println("Número = ");
        n1 = input.nextInt();

        if(n1 >= 0){
            System.out.println("Número é positivo ");
        }else{
            System.out.println("Número é negativo ");
        }
        
        input.close();
    }
}
