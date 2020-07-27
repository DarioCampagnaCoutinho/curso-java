package com.java.modulo08.oo.exercicios.exercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Dario";
		f.sobrenome = "Campagna";
		f.cargo = "Mecânico";
		f.salario = 2000.00;
		
		System.out.println("Dados Funcionários!!!!");
		System.out.println("Nome: "+f.nome);
		System.out.println("Sobrenome: "+f.sobrenome);
		System.out.println("Cargo: "+f.cargo);
		System.out.println("Salário: "+f.salario);

	}

}
