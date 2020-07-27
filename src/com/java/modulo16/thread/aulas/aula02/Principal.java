package com.java.modulo16.thread.aulas.aula02;



public class Principal {

	public static void main(String[] args) {
		
		Thread t = new Rotina();
		t.start();
		
		Thread estaMinhaThread = Thread.currentThread();
		
		for(int i = 0; i < 100; i++){
			System.out.println("Estou na Thread "+estaMinhaThread.getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
