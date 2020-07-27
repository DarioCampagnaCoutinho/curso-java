package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 04, calculo da raiz quadrada.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio04
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int n = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		double [] vetorA = new double [n];
		double [] vetorB = new double [vetorA.length];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextDouble();

			vetorB [i] = Math.sqrt(vetorA[i]);

		}


		for(int i = 0; i < vetorA.length;i++){
			System.out.println(vetorA[i]);

		}

		for(int i = 0; i < vetorB.length;i++){
			System.out.println(vetorB[i]);

		}

	}
}
