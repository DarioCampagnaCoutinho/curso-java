package com.java.modulo06.strings.aulas;

/**
 *
 * @author dario.ccoutinho
 */

public class ClasseSubstringEx4
{
	public static void main(String[]args){
		
		
		String dia, mes, ano, entrada, saida;
		entrada = "02/10/2000";
		dia = entrada.substring(0, 2);
		mes = entrada.substring(3, 5);
		ano = entrada.substring(6);
		saida = dia + " dia, " + mes + " mes e " + ano + " ano";
		
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(ano);
		
		
	}
}
