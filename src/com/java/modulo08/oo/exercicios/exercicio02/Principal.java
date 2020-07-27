package com.java.modulo08.oo.exercicios.exercicio02;

public class Principal {

	public static void main(String[] args) {

		Carro c = new Carro();

		c.cor = "Azul";
		c.modelo = "Audi A1";
		c.potencia = 1.5;

		System.out.println("Hatback");
		System.out.println("Cor: " + c.cor);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Potência: " + c.potencia);

		Carro c1 = new Carro();

		c.cor = "Azul";
		c.modelo = "Audi Q3";
		c.potencia = 1.5;

		System.out.println("Utilitario");
		System.out.println("Cor: " + c.cor);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Potència: " + c.potencia);

	}

}
