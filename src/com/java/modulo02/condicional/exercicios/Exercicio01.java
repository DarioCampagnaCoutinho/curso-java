package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 01, verificando fases da nossa vida através da idade.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio01 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int idade = 0;

        System.out.println("Idade = ");
        idade = input.nextInt();

        if(idade <= 12){
            System.out.println("Criança!");
        }else if(idade >=13 && idade <= 18){
            System.out.println("Adolescente");
        }else if(idade >= 19 && idade <= 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
        
        input.close();
    }
}
