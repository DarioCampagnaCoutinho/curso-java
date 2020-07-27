package com.java.modulo06.strings.aulas;

import java.util.*;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseIndexof
{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);


		String palavra, palavra1;

		System.out.println("Digite a frase: ");
		palavra = leitor.nextLine();

		System.out.println("Digite a frase: ");
		palavra1 = leitor.nextLine();

		int indice = palavra.indexOf(palavra1);
		
		System.out.println("Ocorrência das palavras: "+indice);
		
	}
}
