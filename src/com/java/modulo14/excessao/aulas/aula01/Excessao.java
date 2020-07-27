package com.java.modulo14.excessao.aulas.aula01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excessao {

	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("C:\\cvb\\tem");
			System.out.println("Arquivo Encontrado");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não Encontrado");
			e.printStackTrace();
		}

	}

}
