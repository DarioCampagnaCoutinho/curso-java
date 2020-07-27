package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 15, verificando se os elementos são impares.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio15
{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int n = 0, impar = 0;
		

		System.out.println("Tamanho do Vetor: ");
		n = input.nextInt();

		int [] vetorA = new int [n];

		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite os elementos: ");
			vetorA[i] = input.nextInt();

		}

		for(int i = 0; i < vetorA.length;i++){
			if(vetorA[i] % 2 != 0){
				impar++;
				

			}

		}
		
		int par = vetorA.length - impar;
		
		float porPar = (par * 100) / vetorA.length;
		float porImpar = (impar * 100)/ vetorA.length;
		
		System.out.println(porPar);
		System.out.println(porImpar);
	}
}
