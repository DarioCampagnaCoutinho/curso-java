package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 11, contando os números pares de um vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio11
{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		int n = 0, cont = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];
		
		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

		}
		
		for(int i = 0; i < vetorA.length;i++){
			if(vetorA[i] % 2== 0){
				cont++;
				System.out.println("Posição: "+vetorA[i]);
				System.out.println("Indice: "+i);
				
			}
		}
		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Posição: "+vetorA[i]);
			
		}
		System.out.println("Pares: "+cont);
	}
}
