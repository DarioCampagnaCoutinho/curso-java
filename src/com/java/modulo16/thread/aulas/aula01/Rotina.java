package com.java.modulo16.thread.aulas.aula01;

public class Rotina extends Thread {
	
	public void run(){
		
		for(int i = 0; i < 100; i++){
			System.out.println("Estou na Thread secund�ria");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
