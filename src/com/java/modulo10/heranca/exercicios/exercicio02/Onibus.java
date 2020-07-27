package com.java.modulo10.heranca.exercicios.exercicio02;


public class Onibus extends com.java.modulo10.heranca.exercicios.exercicio02.Veiculo {
	

	public void ligar() {
		super.ligar();
		System.out.println("�nibus ligado");
	}

	public void desligar() {
		super.desligar();
		System.out.println("�nibus desligado");
	}
}
