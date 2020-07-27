package com.java.modulo15.arquivos.exercicios.exercicio01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MetodosLerEscrever {

	private static void escrever(String texto) {
		try {
			FileOutputStream arquivo = 
					new FileOutputStream("C:\\Users\\dario\\OneDrive\\Documentos"
					+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\Lab1.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}


private static void ler() {                 
	try {
            FileInputStream arquivo = 
            		new FileInputStream("C:\\Users\\dario\\OneDrive\\Documentos"
        			+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\Lab1.txt");            
            DataInputStream dados = new DataInputStream(arquivo);                        
            while (dados.available() > 0) {                
            char c = dados.readChar();                 
            System.out.print(c);             
            }
        } catch (IOException ioe) {             
        	ioe.printStackTrace();         
        	} 
	}

public static void main(String[] args) {         
	escrever("Laboratorio 1 de Java");         
	ler();
}
}	