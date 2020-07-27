package com.java.modulo04.vetores.exercicios;

import java.util.Scanner;

/*
 * Exercicío 18, buscando número no vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio18 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int [] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int numerolido, pos = 1;

        System.out.println("Número: ");
        numerolido = scan.nextInt();

        while(vetor[pos] != numerolido & pos <= 20 ){
            pos = pos +1;

            if(vetor [pos] == numerolido){
                System.out.println("O número : "+numerolido+" está na, "+pos+" posição");

            } else{
                System.out.println("O número : "+numerolido+" não está na, posição");
            }
        }
    }
}
