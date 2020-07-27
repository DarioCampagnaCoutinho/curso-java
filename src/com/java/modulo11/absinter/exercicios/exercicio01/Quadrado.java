package com.java.modulo11.absinter.exercicios.exercicio01;

public class Quadrado implements AreaCalculavel {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

}
