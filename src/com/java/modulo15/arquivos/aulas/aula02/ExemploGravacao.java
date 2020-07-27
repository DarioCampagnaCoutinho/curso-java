package com.java.modulo15.arquivos.aulas.aula02;


import java.io.IOException;
import java.io.PrintWriter;

public class ExemploGravacao {

	public static void main(String[] args) {
		
		try {
			PrintWriter writer = 
			new PrintWriter("C:\\Users\\dario\\OneDrive\\Documentos"
			+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\FraseDia.txt");
			writer.println("Java para Sempre");
			writer.println("Python é bom");
			writer.println("Python é Django");
			writer.close();
			System.out.println("Gravado com Sucesso");
		} catch (IOException e) {
		    System.out.println("N�o foi Poss�vel gravar documento");
		}

	}

}
