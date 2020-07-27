package com.java.modulo06.strings.aulas;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseSubstring2
{
	public static void main(String[]args){
		
		String a, b, c, d;
		d = "LOGICA";
		b = "LIVRO";
		c = b + " DE " + d;
		a = (d.substring(0,3)).substring(0,1) + "O" +
			(d.substring(0,3)).substring(2,3);
			
		System.out.println(c);
		System.out.println(a);
		
	}
}
