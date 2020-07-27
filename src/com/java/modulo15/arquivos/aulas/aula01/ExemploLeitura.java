package com.java.modulo15.arquivos.aulas.aula01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(
			new FileReader
			("C:\\Users\\dario\\OneDrive\\Documentos"
			+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\FraseDia.txt"));
			String linha;
			while(reader.ready()){
				linha = reader.readLine();
				System.out.println(linha);
			}
			reader.close();
		} catch (IOException e) {
			
			System.out.println("Falha ao Ler Arquivos");
		}

	}

}
