package com.java.modulo10.heranca.exercicios.exercicio02;

public class Aplicacao {

	public static void main(String[] args) {

		com.java.modulo10.heranca.exercicios.exercicio02.Veiculo v1 = new com.java.modulo10.heranca.exercicios.exercicio02.Automovel();
		v1.ligar();
		System.out.println(v1.isLigado());
		v1.desligar();
		System.out.println(v1.isLigado());
		
		com.java.modulo10.heranca.exercicios.exercicio02.Veiculo v2 = new com.java.modulo10.heranca.exercicios.exercicio02.Motocicleta();
		v2.ligar();
		System.out.println(v2.isLigado());
		v2.desligar();
		System.out.println(v2.isLigado());
		
		com.java.modulo10.heranca.exercicios.exercicio02.Veiculo v3 = new com.java.modulo10.heranca.exercicios.exercicio02.Onibus();
		v3.ligar();
		System.out.println(v3.isLigado());
		v3.desligar();
		System.out.println(v3.isLigado());
	}
}
