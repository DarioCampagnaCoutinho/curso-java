package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 11, calcula media e verifica se aluno teve nota maior que 7.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio11 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        Double nota1, nota2, media;

        System.out.println("Nota 1 = ");
        nota1 = input.nextDouble();

        System.out.println("Nota 2 = ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        
        input.close();
    }
}
