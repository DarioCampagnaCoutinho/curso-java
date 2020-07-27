package com.java.modulo06.strings.aulas;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseSubstringEx3
{
	public static void main(String[]args){
		
		String h, i, j, k;
		h = "PROGRAMACAO";
		j = h.substring(0, 8);
		i = h.substring(7) + " DE " + (j + "R");
		k = h.substring(3, 8);
		
		System.out.println(j);
		System.out.println(i);
		System.out.println(k);
		
	}
}
