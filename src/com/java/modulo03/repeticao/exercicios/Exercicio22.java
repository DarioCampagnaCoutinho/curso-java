package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 22, validação com do while e verificação de números em uma determinada faixa.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio22 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        boolean validar = false;
        double numeroInicial = 0, numeroFinal = 0;
        int contador1 = 0, contador2 = 0;

        while (!validar) {
            System.out.println("Informe um número inicial : ");
            numeroInicial = ler.nextDouble();
            if (numeroInicial > 0) {
                validar = true;
            } else {
                System.out.println("Digite Novamente!");
            }

        }

        validar = false;

        while (!validar) {
            System.out.println("Informe um número final : ");
            numeroFinal = ler.nextDouble();
            if (numeroFinal > 0 && numeroFinal > numeroInicial) {
                validar = true;
            } else {
                System.out.println("Digite Novamente!");
            }

        }

        for (double i = numeroInicial; i <= numeroFinal; i++ ){
            if(i <= 26){
                contador1++;
            }
            if(i > 26 && i <= 56){
                contador2++;
            }
            //System.out.println(i);
        }
        System.out.println("Contador 1 :" + contador1);
        System.out.println("Contador 2 :" + contador2);
    }
}
