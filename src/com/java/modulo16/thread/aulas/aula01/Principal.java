package com.java.modulo16.thread.aulas.aula01;

public class Principal {

	public static void main(String[] args) {
		
		Thread t = new Rotina();
		t.start();
		
		for(int i = 0; i < 100; i++){
			System.out.println("Estou na Thread Principal");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
