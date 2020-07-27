package com.java.modulo08.oo.exercicios.exercicio05;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Dario");
		aluno.quantidade++;
	    aluno.ImprimeAluno();
        
		aluno.setNome("Maria");
		aluno.quantidade++;
		aluno.ImprimeAluno();
			}

}
