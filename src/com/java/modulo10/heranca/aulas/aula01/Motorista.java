package com.java.modulo10.heranca.aulas.aula01;

public class Motorista extends Funcionario {
	
	private String cnh;
	private String placaAutomovel;
	
	public Motorista(int matricula, String nome, double salario, String cnh, String placaAutomovel){
		super(matricula, nome, salario);
		this.cnh = cnh;
		this.placaAutomovel = placaAutomovel;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getPlacaAutomovel() {
		return placaAutomovel;
	}
	public void setPlacaAutomovel(String placaAutomovel) {
		this.placaAutomovel = placaAutomovel;
	}

}
