package com.java.modulo08.oo.exercicios.exercicio05;

public class Aluno {
	
	private String nome;
	public static int quantidade = 0;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void ImprimeAluno(){
		System.out.println("Nome"+nome);
		System.out.println("Quantidade: "+quantidade);
	}

}
