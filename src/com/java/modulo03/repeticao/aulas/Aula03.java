package com.java.modulo03.repeticao.aulas;

/*
 * Aula 03, laço de repetição while, linha e coluna
 *
 * Dario Campagna Coutinho
 * */


public class Aula03 {

    public static void main(String [] args){

        int linha, coluna;

        linha = 1;
        while (linha < 5)
        {
            coluna = 1;
            while (coluna < 5)
            {
                System.out.print(linha * coluna + "   ");
                coluna += 1;
            }
            linha += 1;
            System.out.println();
        }

    }
}
