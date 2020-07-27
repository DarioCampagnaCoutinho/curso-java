package com.java.modulo01.variaveis.exercicios;

import java.util.Scanner;

/*
 * Exercicío 10, calculando celsius.
 * 
 * Dario Campagna Coutinho
 * */


public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius = 0, farenheit = 0;
		
		System.out.println("Farenheit : ");
		farenheit = scan.nextDouble();
		
		celsius = (5 * (farenheit - 32) / 9);
		
		System.out.printf("Celsius = %.2f", celsius);
		
		scan.close();

	}

}
