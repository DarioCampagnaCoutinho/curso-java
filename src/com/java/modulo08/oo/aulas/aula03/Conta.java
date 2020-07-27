package com.java.modulo08.oo.aulas.aula03;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public String getNome(){
		return nome;
	}
    public void setNome(String nome){
    	this.nome = nome;
    }
    public double getSaldo(){
    	return saldo;
    }
    public void setSaldo(double saldo){
    	this.saldo = saldo;
    }
    
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
}
