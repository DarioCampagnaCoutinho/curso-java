package com.java.modulo09.consencap.aulas.aula01;

public class MDC {
	
	public static int calculaMDC(int num, int dem){
		int aux;
		if(num < dem){
			aux = num;
			num = dem;
			dem = aux;
		}
		int resto = num % dem;
		while(resto != 0){
			num = dem;
			dem = resto;
			resto = num % dem;
		}
		return dem;
	}

}
