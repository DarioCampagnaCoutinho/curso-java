package com.java.modulo05.matrizes.exercicios;

import java.util.Scanner;

/*
 * Exercicío 09, jogo da velha.
 * Dario Campagna Coutinho
 * */

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 X");
        System.out.println("Jogador 2 O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!false) {

            if (jogada % 2 == 1) {
                System.out.println("Vez Jogador 1. Escilha linha [1, 2, 3]");
                sinal = 'X';

            } else {
                System.out.println("Vez Jogador 2. Escilha linha [1, 2, 3]");
                sinal = 'O';

            }

            boolean linhaValida = false;

            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2, 3)");
                linha = leitor.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;

                } else {
                    System.out.println("Digile novamente, linha inválida");

                }

            }

            boolean colunaValida = false;

            while (!colunaValida) {
                System.out.println("Entre com a coluna(1, 2, 3)");
                coluna = leitor.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;

                } else {
                    System.out.println("Digile novamente, coluna inválida");

                }

            }
            linha--;
            coluna--;

            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição Inválida, tente novamente");

            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogoVelha[i][j]+ "   |   ");
                }
                System.out.println("\n");

            }
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][1] == 'X') ||
                    (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) {

                ganhou = true;
                System.out.println("Parabêns Jogador 1 ganhou");

            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][1] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
                ganhou = true;
                System.out.println("Parabêns Jogador 2 ganhou");

            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou");

            }

        }//Fim do Primeiro While

    }

}
