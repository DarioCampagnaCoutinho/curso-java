package com.java.modulo01.variaveis.exercicios;

/*
 * Exercicío 09, operadores lógicos, relacionais e variáveis.
 * 
 * Dario Campagna Coutinho
 * */

public class Exercicio09 {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;
        float x = 2.5f, y = 10.0f, z = 1.0f;
        String nome = "Dario", rua = "Girassol";
        boolean l1 = true;

        System.out.println("Nome : " + nome);
        System.out.println("Rua : " + rua);
        System.out.println(x > y && c <= b);
        System.out.println((c - 3 * a) < (x + 2 * z));
        System.out.println(!l1);
        System.out.println(((y / 2) == x) || ((b * 2) >= (a + c)));
    }
}
