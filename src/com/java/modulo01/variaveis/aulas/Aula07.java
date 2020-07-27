package com.java.modulo01.variaveis.aulas;

import java.util.Scanner;

/*
 * Aula 07, entrada de dados com o teclado.
 * 
 * Dario Campagna Coutinho
 * */

public class Aula07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome completo: ");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Nome Completo: " + nomeCompleto);
		
		System.out.println("Digite o primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.println("Nome: " + primeiroNome);
		
		System.out.println("Digite idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Idade: " + idade);
		
		System.out.println("Digite altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Altura: " + altura);
		
		scan.close();

	}

}
