package com.java.modulo16.thread.exercicios.exercicio01;

public class Principal {

	public static void main(String[] args) {
		
		ThreadLab t1 = new ThreadLab("Thread 1");     
		ThreadLab t2 = new ThreadLab("Thread 2");       
		t1.start();     
		t2.start();

	}

}
