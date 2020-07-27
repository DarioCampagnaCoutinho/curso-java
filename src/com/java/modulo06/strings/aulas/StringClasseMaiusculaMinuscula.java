package com.java.modulo06.strings.aulas;

import java.util.*;

/**
 *
 * @author dario.ccoutinho
 */

public class StringClasseMaiusculaMinuscula
{
	public static void main(String[] args)
	{
		System.out.println("String!");

		Scanner input = new Scanner(System.in);

		String texto;

		System.out.println("Digite um texto:  ");
		texto = input.nextLine();

		System.out.println("Texto em maiúsculo: "+texto.toUpperCase());
		System.out.println("Texto em minúsculo: "+texto.toLowerCase());

	}
}
