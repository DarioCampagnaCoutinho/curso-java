package com.java.modulo11.absinter.exercicios.exercicio01;

public class Retangulo implements AreaCalculavel {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}

}
