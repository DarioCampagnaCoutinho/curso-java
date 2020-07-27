package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 10, calculando o resto de um vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio10
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int n = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];
		int [] vetorB = new int [vetorA.length];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

			vetorB [i] = vetorA[i] % 2;

		}


		for(int i = 0; i < vetorA.length;i++){
			System.out.println(vetorA[i]);

		}

		for(int i = 0; i < vetorB.length;i++){
			System.out.println(vetorB[i]);

		}

	}
}
