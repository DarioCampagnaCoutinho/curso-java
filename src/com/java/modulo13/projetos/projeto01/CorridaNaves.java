package com.java.modulo13.projetos.projeto01;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class CorridaNaves {

    public static void main(String[] args) {
        System.out.println("Campeonato de Naves!");

        Scanner input = new Scanner(System.in);

        int etapa1 = 0, etapa2 = 0, etapa3 = 0;
        int tempo1 = 0, tempo2 = 0, tempo3 = 0;
        int diferenca1 = 0, diferenca2 = 0, diferenca3 = 0;
        int inscricao = 0, contador = 0, maior = 0, diferenca1_maior = 0, diferenca2_maior = 0, diferenca3_maior = 0, inscricao_maior = 0;
        boolean validar = false;

        System.out.println("------------------------------------------------");

        System.out.println("Digite o tempo da etapa 1: ");
        etapa1 = input.nextInt();

        System.out.println("Digite o tempo da etapa 2: ");
        etapa2 = input.nextInt();

        System.out.println("Digite o tempo da etapa 3: ");
        etapa3 = input.nextInt();

        System.out.println("-------------------------------------------------");

        //while
        while (!validar) {

            System.out.println("Número da Inscrição: ");
            inscricao = input.nextInt();
            contador++;
            if (inscricao == 0 || inscricao < 0) {
                validar = true;

            } else {

                System.out.println("Digite em minutos o tempo da etapa 1: ");
                tempo1 = input.nextInt();

                System.out.println("Digite em minutos o tempo da etapa 2: ");
                tempo2 = input.nextInt();

                System.out.println("Digite em minutos o tempo da etapa 3: ");
                tempo3 = input.nextInt();

                diferenca1 = etapa1 - tempo1;

                diferenca2 = etapa2 - tempo2;

                diferenca3 = etapa3 - tempo3;

                if (Math.abs(diferenca1) < 5) {
                    //Soma 100 pontos
                    diferenca1 = 100;

                    System.out.println("Pontos 1° Etapa: " + diferenca1);

                } else if (Math.abs(diferenca1) >= 5 && Math.abs(diferenca1) <= 10) {
                    //Soma 85 pontos
                    diferenca1 = 85;
                    System.out.println("Pontos 1° Etapa: " + diferenca1);

                } else if (Math.abs(diferenca1) > 10) {
                    //Soma 80 - (tempo1 - 10) / 5;
                    diferenca1 = 80 - (Math.abs(diferenca1) - 10) / 5;

                    System.out.println("Pontos 1° Etapa: " + diferenca1);

                }

                if (Math.abs(diferenca2) < 5) {
                    //Soma 100 pontos
                    diferenca2 = 100;
                    System.out.println("Pontos 2° Etapa: " + diferenca2);

                } else if (Math.abs(diferenca2) >= 5 && Math.abs(diferenca2) <= 10) {
                    //Soma 85 pontos
                    diferenca2 = 85;
                    System.out.println("Pontos 2° Etapa: " + diferenca2);

                } else if (Math.abs(diferenca2) > 10) {
                    //Soma 80 - (tempo2 - 10) / 5;
                    diferenca2 = 80 - (Math.abs(diferenca2) - 10) / 5;

                    System.out.println("Pontos 2° Etapa: " + diferenca2);

                }

                if (Math.abs(diferenca3) < 5) {
                    //Soma 100 pontos
                    diferenca3 = 100;

                    System.out.println("Pontos 3° Etapa: " + diferenca3);

                } else if (Math.abs(diferenca3) >= 5 && Math.abs(diferenca3) <= 10) {
                    //Soma 85 pontos
                    diferenca3 = 85;
                    System.out.println("Pontos 3° Etapa: " + diferenca3);

                } else if (Math.abs(diferenca3) > 10) {
                    //Soma 80 - (tempo2 - 10) / 5;
                    diferenca3 = 80 - (Math.abs(diferenca3) - 10) / 5;

                    System.out.println("Pontos 3° Etapa:" + diferenca3);

                }

            }
        }
    }
}
