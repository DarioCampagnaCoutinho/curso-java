package com.java.modulo11.absinter.exercicios.exercicio02;

public class ContaCorrente extends ContaBancaria {

	public double calcularSaldo() {	
		return saldo - (saldo * 0.1);
	}

}
