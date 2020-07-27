package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 14, verifica se exite números pares, depois soma e faz a média.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio14
{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int n = 0, cont = 0, soma = 0;
		float media = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

		}

		for(int i = 0; i < vetorA.length;i++){
			if(vetorA[i] % 2 != 0){
				cont++;
				soma = soma + vetorA[i];
				media = soma / cont;
				System.out.println("Elementos: "+vetorA[i]);

			}

		}
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
	}
}
