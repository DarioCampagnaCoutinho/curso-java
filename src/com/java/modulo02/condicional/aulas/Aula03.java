package com.java.modulo02.condicional.aulas;

import java.util.Scanner;

/*
 * Aula 03, calculo da conta do telefone.
 *
 * Dario Campagna Coutinho
 * */


public class Aula03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de minutos = ");
		int minutos = sc.nextInt();
		
		double conta = 50;
		if(minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		System.out.printf("Valor da conta = R$ %.2f", conta);
		
		sc.close();

	}

}
