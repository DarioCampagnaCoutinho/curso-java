package com.java.modulo05.matrizes.aulas;

/*
 * Aula 03, Iniciando com matrizes irregulares.
 *
 * */

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numEntrevistado = 0, qtdFilhos = 0;

        System.out.println("Números de pessoas entrevistadas: ");
        numEntrevistado = scan.nextInt();

        String [][] nomeFilhos = new String[numEntrevistado][];

        for(int i = 0; i < nomeFilhos.length;i++){

            System.out.println("Entre com a quatidade de Filhos: ");
            qtdFilhos = scan.nextInt();

            nomeFilhos [i] = new String[qtdFilhos];

            for(int j = 0; j < nomeFilhos[i].length;j++){
                System.out.println("Nome dos Filhos: "+(j + 1));
                nomeFilhos[i][j] = scan.next();
            }
        }

        for(int i = 0; i < nomeFilhos.length;i++){
            System.out.println("Pessoa "+i+" tem "+nomeFilhos[i].length+" filhos");
            for(int j = 0; j < nomeFilhos[i].length;j++){
                System.out.println(nomeFilhos[i][j]);
            }

        }
    }

}
