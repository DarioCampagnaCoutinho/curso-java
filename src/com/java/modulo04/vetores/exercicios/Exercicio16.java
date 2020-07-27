package com.java.modulo04.vetores.exercicios;

import java.util.*;

/*
 * Exercicío 16, soma de números no vetor.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio16
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
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtd = 0;
		int igual15 = 0;
		
		for(int i = 0; i < vetorA.length;i++){
			if(vetorA[i] == 15){
				igual15++;
				
			}else if(vetorA[i] < 15){
				somaMenor15 += vetorA[i];
				
			}else if(vetorA[i] > 15){
				qtd++;
				somaMaior15 += vetorA[i];
				
			}
			
		}
		for(int i = 0;i < vetorA.length;i++){
			System.out.println(vetorA[i]);
			
		}
		System.out.println("Quantidade Igual a 15:"+igual15);
		System.out.println("Soma Menor: "+somaMenor15);
		System.out.println("Soma Maior: "+(somaMaior15/qtd));
	}
}
