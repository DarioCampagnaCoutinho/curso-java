package com.java.modulo11.absinter.exercicios.exercicio02;


public class ContaInvestimento extends ContaBancaria {

	public double calcularSaldo() {
		return saldo + (saldo * 0.05);
	}
}
