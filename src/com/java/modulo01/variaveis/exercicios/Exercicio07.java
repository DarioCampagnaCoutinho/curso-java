package com.java.modulo01.variaveis.exercicios;

import java.util.Scanner;

/*
 * Exercicío 07, expressão matemática com entrada de dados.
 * 
 * Dario Campagna Coutinho
 * */


public class Exercicio07 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, d = 0, r = 0;
		
		System.out.println("A = ");
		a = sc.nextDouble(); 
		
		System.out.println("B = ");
		b = sc.nextDouble(); 
		
		System.out.println("C = ");
		c = sc.nextDouble(); 
		
		System.out.println("D = ");
		d = sc.nextDouble(); 
		
		r = ((a * b) - (c * d));
		
		System.out.printf("Resultado = %f", r);
		
		sc.close();




	}

}
