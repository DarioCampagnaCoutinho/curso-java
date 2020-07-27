package com.java.modulo17.colecoes.aulas.aula02;

public class Cliente implements Comparable<Cliente>{
   
	private String nome;
	private String endereco;
	private String telefone;
	
	public Cliente(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int compareTo(Cliente other){
		return this.nome.compareTo(other.nome);
		
	}
	
}
