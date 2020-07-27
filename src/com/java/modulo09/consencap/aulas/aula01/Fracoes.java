package com.java.modulo09.consencap.aulas.aula01;

public class Fracoes {
	
	int numerador, denominador;
	double fracao;
	
	public Fracoes(int a, int b) throws IllegalArgumentException{
		numerador = a;
		denominador = b;
		if(b == 0){
			throw new IllegalArgumentException("Denominador não pode ser zero");
		}
		fracao = numerador / denominador;
		simplificaFracao();
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public double getFracao() {
		return fracao;
	}
	
	public String toString(){
		return String.valueOf(numerador)+'/'+String.valueOf(denominador);
	}
    
	public boolean equals(Fracoes a){
		return getFracao() == a.getFracao();
	}
	
	public Fracoes soma(Fracoes a){
		Fracoes b = new Fracoes(numerador * a.getDenominador() + a.getNumerador() * denominador, denominador * a.getDenominador());
		return b;
	}
	
	public Fracoes subtrai(Fracoes a){
		Fracoes b = new Fracoes(-a.getNumerador(), a.getDenominador());
		return soma(b);
	}
	
	private void simplificaFracao(){
		int mdc = MDC.calculaMDC(numerador, denominador);
		if(mdc != 1){
			numerador /= mdc;
			denominador /= mdc;
			
		}
	}
}
