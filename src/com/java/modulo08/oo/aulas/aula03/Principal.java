package com.java.modulo08.oo.aulas.aula03;

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.setNumero(100);
		c1.setNome("Dario");
		c1.depositar(160);
		c1.retirar(180);

		System.out.println("Dados da Conta: ");
		System.out.println("N�mero da Conta: " + c1.getNumero());
		System.out.println("Nome do Cliente: " + c1.getNome());
		System.out.println("Saldo da Conta: " + c1.getSaldo());

	}

}
