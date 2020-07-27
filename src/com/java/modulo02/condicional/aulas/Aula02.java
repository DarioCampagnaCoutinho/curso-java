package com.java.modulo02.condicional.aulas;

import java.util.Scanner;

/*
 * Aula 02, verifica se o número é divisível por 2 e 4.
 *
 * Dario Campagna Coutinho
 * */


public class Aula02 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Número = ");
        numero = input.nextInt();

        if(numero % 2 == 0 && numero % 4 == 0){
            System.out.println("Número é divisel por 2 e 4!");
        }
        
        input.close();
    }
}
