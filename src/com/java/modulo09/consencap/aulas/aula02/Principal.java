package com.java.modulo09.consencap.aulas.aula02;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(4003, "Dario", 100);
		Conta c2 = new Conta(4004, "Mario", 100);
		Conta c3 = new Conta(4005, "Fario", 200);
		
		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
		System.out.println(c3.getDados());

	}

}
