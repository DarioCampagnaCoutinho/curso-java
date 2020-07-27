package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 12, soma de elementos do vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio12
{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int n = 0, soma = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();
			soma = soma + vetorA[i];

		}
		
		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Elementos: "+vetorA[i]);
			
		}
		
		System.out.println("Soma: "+soma);
	}
}
