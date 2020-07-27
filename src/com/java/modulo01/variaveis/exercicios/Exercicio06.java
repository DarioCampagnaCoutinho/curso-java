package com.java.modulo01.variaveis.exercicios;

import java.util.Scanner;

/*
 * Exercicío 06, calculo da área.
 * 
 * Dario Campagna Coutinho
 * */


public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = 0, area = 0;
		final double PI = 3.14159;
		
		System.out.println("Informe raio = ");
		raio = sc.nextDouble();
		
		area = PI * (Math.pow(raio, 2));
		
		System.out.printf("Área = %f", area);
		
		sc.close();
		

	}

}
