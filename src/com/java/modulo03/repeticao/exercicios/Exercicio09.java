package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 09, de 1000 números, somar números divisíveis por 3 e 5.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio09 {

    public static void main(String[] args)
    {
        int soma = 0, contador = 0;

        for(int i = 0; i < 1000;i++){
            if(i % 3 == 0 && i % 5 == 0){
                soma = soma + i;
                contador++;

            }
        }
        System.out.println(soma);
        System.out.println(contador);

    }

}
