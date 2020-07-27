package com.java.modulo06.strings.aulas;

import java.util.*;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseReplace
{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);


		String palavra, palavra1, palavra2, subistituta;

		System.out.println("Digite a frase: ");
		palavra = leitor.nextLine();

		System.out.println("Digite a frase: ");
		palavra1 = leitor.nextLine();

		System.out.println("Digite a frase: ");
		palavra2 = leitor.nextLine();

		palavra = palavra.replace(palavra1, palavra2);

		subistituta = palavra;

		System.out.println(subistituta);


	}
}
