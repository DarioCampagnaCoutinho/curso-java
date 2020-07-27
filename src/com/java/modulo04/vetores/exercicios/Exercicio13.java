package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 13, verificando se os elementos dos vetores é divisível por 5.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio13
{
	
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int n = 0;

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

		}
		
		for(int i = 0; i < vetorA.length;i++){
			if(vetorA[i] % 5 == 0){
				System.out.println("Elementos: "+vetorA[i]);
				
			}
			
		}
	}
}
		
