package com.java.modulo08.oo.exercicios.exercicio04;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println("Subtrair double - double: "+c.subtrair(3f, 1f));
		System.out.println("Subtrair double - int: "+c.subtrair(5f, 2d));
		System.out.println("Sutrair int - double: "+c.subtrair(10d, 5f));

	}

}
