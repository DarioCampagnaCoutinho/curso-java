package com.java.modulo06.strings.aulas;

import java.util.*;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseSubstring
{
	public static void main(String[] args)
	{
		System.out.println("String!");

		Scanner input = new Scanner(System.in);

		String texto;

		System.out.println("Digite um texto:  ");
		texto = input.nextLine();
		
		System.out.println("Texto a partir do indice 1: "+texto.substring(1));
		System.out.println(texto.substring(1, 5));

	}
}
