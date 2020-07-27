package com.java.modulo01.variaveis.exercicios;

import java.util.Scanner;

/*
 * Exercicío 05, soma de números.
 * 
 * Dario Campagna Coutinho
 * */

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N�mero 1 = ");
		int numero1 = sc.nextInt();
		
		System.out.println("N�mero 2 = ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.printf("Resultado = %d", soma);
		
		sc.close();


	}

}
