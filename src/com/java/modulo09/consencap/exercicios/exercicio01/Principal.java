package com.java.modulo09.consencap.exercicios.exercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro();
		System.out.println(c1.getDados());
		
		Cadastro c2 = new Cadastro("Chico", "Coutinho", 34);
		System.out.println(c2.getDados());
		
		Cadastro c3 = new Cadastro("Lica", "Coutinho", 56);
		System.out.println(c3.getDados());

	}

}
