package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 08, verifica uma letra, se letra igual M ou m é masculino, se letra
 * é igual F ou f é feminino se não é letra inválida.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio08 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Entre com uma letra (F ou M) = ");
        letra = input.next();

        if(letra.equals("m") || letra.equals("M")){
            System.out.println("Masculino ");
        }else if(letra.equals("f") || letra.equals("F")){
            System.out.println("Feminino ");
        }
        else{
            System.out.println("Inválido ");
        }
        input.close();
    }
}
