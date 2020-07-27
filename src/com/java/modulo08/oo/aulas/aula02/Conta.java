package com.java.modulo08.oo.aulas.aula02;

public class Conta {
	
	public int numero;
	public String nome;
	private double saldo;
    
	public void depositar(double v){
		saldo += v;
	}
	
	public void retirar(double v){
		if(v <= saldo){
			saldo -= v;
		}else{
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public double getSaldo(){
		return saldo; 
	}
}
