package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 06, soma de dois vetores para um terceiro vetor.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio06
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int n = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

		}
		
		for(int i = 0; i < vetorB.length;i++){
			System.out.println("Digite os elementos: ");
			vetorB[i] = input.nextInt();

		}
		
		for(int i = 0; i < vetorC.length;i++){
			vetorC[i] = vetorA[i] + vetorB[i];

		}


		for(int i = 0; i < vetorC.length;i++){
			System.out.println(vetorC[i]);

		}

	}
}
