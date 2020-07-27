package com.java.modulo10.heranca.exercicios.exercicio02;

public class Automovel extends com.java.modulo10.heranca.exercicios.exercicio02.Veiculo {
	

	public void ligar() {
		super.ligar();
		System.out.println("Automóvel ligado");
	}

	public void desligar() {
		super.desligar();
		System.out.println("Automóvel desligado");
	}
}
