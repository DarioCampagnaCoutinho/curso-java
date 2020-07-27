package com.java.modulo06.strings.aulas;

import java.util.*;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseCharAt
{
	public static void main(String[] args)
	{
		System.out.println("String!");

		Scanner input = new Scanner(System.in);

		String texto;

		System.out.println("Digite um texto:  ");
		texto = input.nextLine();
		
		System.out.println("Primeira Letra: "+texto.charAt(0));
		System.out.println("Última Letra: "+texto.charAt(texto.length()-1));

	}
}
