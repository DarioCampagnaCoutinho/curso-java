package com.java.modulo10.heranca.exercicios.exercicio02;


public class Motocicleta extends com.java.modulo10.heranca.exercicios.exercicio02.Veiculo {


	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligada");
	}

	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta desligada");
	}
}
