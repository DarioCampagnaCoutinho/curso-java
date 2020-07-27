package com.java.modulo10.heranca.exercicios.exercicio02;

public class Veiculo {

	private boolean ligado;

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}
}
