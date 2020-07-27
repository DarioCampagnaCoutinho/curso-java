package com.java.modulo09.consencap.aulas.aula01;

public class NUMEROREVERSO {
	
	public static int achaReverso(int numero){
		int numeroInvertido = 0;
		int temp = 0;
		while(numero > 0){
			temp = numero % 10;
			numeroInvertido = numeroInvertido * 10 + temp;
			numero = numero / 10;
		}
		return numeroInvertido;
	}

}
