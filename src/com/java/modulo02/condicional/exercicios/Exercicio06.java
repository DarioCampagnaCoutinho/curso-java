package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 06, verifica qual número é maior.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio06 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int n1 = 0, n2 = 0;

        System.out.println("Número 1 = ");
        n1 = input.nextInt();

        System.out.println("Número 2 = ");
        n2 = input.nextInt();

        if(n1 > n2){
            System.out.println("Número 1 é maior = " + n1);
        }else{
            System.out.println("Número 2 é maior = " + n2);
        }
        
        input.close();
    }
}
