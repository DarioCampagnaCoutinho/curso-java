package com.java.modulo04.vetores.aulas;

import java.util.Scanner;

/*
* Aula 01, Iniciando com vetores.
*
* */

public class Aula01 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int [] vetor = {1, 2, 3, 4};

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
