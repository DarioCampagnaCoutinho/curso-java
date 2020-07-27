package com.java.modulo03.repeticao.aulas;

/*
 * Aula 04, laço de repetição while, linha e coluna. Fazendo soma
 *
 * Dario Campagna Coutinho
 * */


public class Aula04 {

    public static void main(String [] args){

        int linha, coluna, soma;

        soma = 0;
        linha = 1;
        while (linha < 5)
        {
            coluna = 1;
            while (coluna < 5)
            {
                System.out.print(coluna + "   ");
                soma += coluna;
                coluna += 1;
            }
            linha += 1;
            System.out.println();
        }
        System.out.println("Soma = " + soma);

    }
}
