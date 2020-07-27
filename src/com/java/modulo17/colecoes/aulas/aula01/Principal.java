package com.java.modulo17.colecoes.aulas.aula01;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		
		Collection<Funcionario> funclist = new ArrayList<>();
		
		funclist.add(new Funcionario(2000, "Jos�"));
		funclist.add(new Funcionario(3000, "Jo�o"));
		
		for(Funcionario f : funclist){
            System.out.println("Ol� "+f.getNome());			
		}
        
		funclist.forEach(f -> System.out.println("Ol� "+f.getNome()));
	}

}
