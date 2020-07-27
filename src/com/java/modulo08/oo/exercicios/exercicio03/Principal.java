package com.java.modulo08.oo.exercicios.exercicio03;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println("Somar: "+c.somar(10, 7));
		System.out.println("Subtrair: "+c.subtrair(10, 9));
		System.out.println("Dividir: "+c.dividir(10, 5));
		System.out.println("Multiplicar: "+c.multiplicar(30, 4));

	}

}
