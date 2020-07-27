package com.java.modulo09.consencap.aulas.aula01;

public class Principal {

	public static void main(String[] args) {
		
		Fracoes f = new Fracoes(12, 23);
		Fracoes f2 = new Fracoes(10, 12);
		Fracoes f3 = new Fracoes(10, 4);
		System.out.println(f);
		System.out.println(f2);
		System.out.println(f3);
		
		f2 = f.soma(f2);
		f3 = f.subtrai(f3);
		System.out.println("12/23 + 5/6 = "+f2.toString());
		System.out.println("12/23 - 10/4 = "+f3.toString());

	}

}
