package com.java.modulo17.colecoes.aulas.aula02;

import java.util.SortedSet;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
	    
		SortedSet<Cliente> set = new TreeSet<>();
		set.add(new Cliente("Dario", "Rua Tal", "3456-6688"));
		set.add(new Cliente("Mario", "Rua Tu", "3456-1234" ));
		set.add(new Cliente("Fario", "Rua Te", "3456-6756" ));
		
		set.forEach(c -> System.out.println(c.getNome()));

	}

}
