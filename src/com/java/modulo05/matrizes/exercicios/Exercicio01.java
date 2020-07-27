package com.java.modulo05.matrizes.exercicios;

/*
 * Exercicío 01, fazendo soma das notas.
 *
 * */


public class Exercicio01 {

    public static void main(String[] args) {

        double [][] notas = new double [3][3];

        notas[0][0]=10;
        notas[0][1]=20;
        notas[0][2]=30;
        notas[1][0]=40;
        notas[1][1]=50;
        notas[1][2]=60;
        notas[2][0]=70;
        notas[2][1]=80;
        notas[2][2]=90;

        double soma;
        for(int i = 0; i < notas.length;++i){
            soma = 0;
            for(int j = 0; j < notas[i].length;++j){
                soma =+ notas[i][j];

            }
            System.out.println("Média do aluno " + (i + 1) + " é :" + (soma / 3));

        }

        for(int i = 0; i < notas.length;++i){
            for(int j = 0; j < notas[i].length;++j){
                System.out.println(i +" | "+j+" = "+notas[i][j]+"\t");

            }
            System.out.println();

        }
    }
}
