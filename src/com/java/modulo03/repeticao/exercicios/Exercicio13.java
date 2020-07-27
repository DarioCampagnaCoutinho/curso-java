package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 13, calculando a potência.
 *
 * Dario Campagna Coutinho
 * */


import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args)
    {
        System.out.println("Potência!");

        Scanner input = new Scanner(System.in);

        float base, potencia, resultado = 0;

        System.out.println("Base: ");
        base = input.nextFloat();

        System.out.println("Potência: ");
        potencia = input.nextFloat();

        resultado = base;

        for(int i = 1; i < potencia;i++){
            resultado *= base;
            System.out.println("Indice : " + i);
            System.out.println("Potência parcial : " + resultado + " Base : " + base);
        }

        System.out.println("Potência final : " + resultado);


    }

}
