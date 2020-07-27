package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 15, verifica se é um triângulo.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Lado 1:");
        lado1 = scan.nextInt();

        System.out.println("Lado 2:");
        lado2 = scan.nextInt();

        System.out.println("Lado 3:");
        lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("Não forma um triângulo!!!");
        }
    }
}
