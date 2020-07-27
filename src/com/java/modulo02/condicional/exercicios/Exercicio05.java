package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 05, calculando aumento de salário, essa abordagem é melhor que a resolução dos
 * exercicíos 16 e 17.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();

        int percentual = 0;
        if (salario <= 280){
            percentual = 20;
        } else if (salario > 280 && salario < 700){
            percentual = 15;
        } else if (salario >= 700 && salario < 1500){
            percentual = 10;
        } else if (salario >= 1500){
            percentual = 5;
        }

        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
