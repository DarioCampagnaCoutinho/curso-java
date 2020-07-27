package com.java.modulo13.projetos.projeto03;

import java.util.Random;
import java.util.Scanner;

/**
 * @author DARIO
 */
public class JavaJogoVelha {

    static char[][] jogoVelha = new char[3][3];
    static int jogada = 1;

    public static boolean ValidarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == sinal) {
            return false;

        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }

    }

    public static void ImprimirTabuleiro() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogoVelha[i][j] + "   |   ");
            }
            System.out.println("\n");

        }

    }

    public static boolean VerificarGanhador(char sinal) {

        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)
                || (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal)
                || (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][1] == sinal)
                || (jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)
                || (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal)
                || (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)
                || (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)) {

            return true;

        }
        return false;

    }

    public static boolean VezJogador1() {

        if (jogada % 2 == 1) {
            return true;

        }

        return false;

    }

    public static int Valor(String tipoValor, Scanner leitor) {

        int valor = 0;
        boolean valorValida = false;

        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2, 3)");
            valor = leitor.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;

            } else {
                System.out.println("Digile novamente, linha inválida");
            }
        }
        valor--;

        return valor;
    }

    public static int Valor1(String tipoValor, Random gerar) {

        int valor = 0;
        boolean valorValida = false;

        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2, 3)");
            valor = gerar.nextInt(4) - 1;
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Digile novamente, linha inválida");
            }

        }
        valor--;

        return valor;
    }

    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {

        Scanner leitor = new Scanner(System.in);

        String opcao = "";

        while (true) {

            System.out.println("0-Sair");
            System.out.println("1-Jogador Vs Jogador");
            System.out.println("2-Jogador Vs Computador");
            System.out.println("Qual módulo deseja jogar?");
            opcao = leitor.next();

            switch (opcao) {

                case "0":
                    System.exit(0);
                    break;

                case "1":
                    Modulo1();
                    break;
                case "2":
                    Modulo2();
                    break;
            }
        }
    }

    public static void Modulo1() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Jogador 1 X");
        System.out.println("Jogador 2 O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;
        int v = 0;

        ImprimirTabuleiro();

        while (!false) {

            if (VezJogador1()) {
                System.out.println("Vez Jogador 1. Escolha linha [1, 2, 3]");
                sinal = 'X';

            } else {
                System.out.println("Vez Jogador 2. Escolha linha [1, 2, 3]");
                sinal = 'O';

            }

            linha = Valor("Linha: ", leitor);
            coluna = Valor("coluna:", leitor);

            ValidarJogada(linha, coluna, sinal);

            ImprimirTabuleiro();

            if (VerificarGanhador('X')) {
                ganhou = true;
                System.out.println("Jogador 1");

            } else if (VerificarGanhador('O')) {
                ganhou = true;
                System.out.println("Jogador 2");

            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou");

            }

        }

    }

    public static void Modulo2() {

        Scanner leitor = new Scanner(System.in);
        Random gerar = new Random();

        System.out.println("Jogador 1 X");
        System.out.println("Jogador 2 O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;
        int v = 0;

        ImprimirTabuleiro();

        while (!false) {

            if (VezJogador1()) {
                System.out.println("Vez Jogador 1. Escolha linha [1, 2, 3]");
                sinal = 'X';
                linha = Valor("Linha: ", leitor);
                coluna = Valor("coluna:", leitor);


            } else {
                System.out.println("Vez Computador 2. Escolha linha [1, 2, 3]");
                sinal = 'O';
                linha = Valor1("Linha: ", gerar);
                coluna = Valor1("Coluna:", gerar);


            }


            ValidarJogada(linha, coluna, sinal);

            ImprimirTabuleiro();

            if (VerificarGanhador('X')) {
                ganhou = true;
                System.out.println("Jogador 1");

            } else if (VerificarGanhador('O')) {
                ganhou = true;
                System.out.println("Jogador 2");

            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou");

            }

        }

    }

}
