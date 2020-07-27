package com.java.modulo16.thread.aulas.aula03;


public class Principal {

public static void main(String[] args) {
		
		Thread t1 = new Rotina();
		Thread t2 = new Rotina();
		Thread t3 = new Rotina();
		Thread t4 = new Rotina();
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
