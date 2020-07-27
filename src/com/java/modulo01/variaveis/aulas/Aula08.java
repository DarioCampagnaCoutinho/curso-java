package com.java.modulo01.variaveis.aulas;

import java.util.Scanner;

/*
 * Aula 08, operadores aritméticos, lógicos e relacionais.
 * 
 * Dario Campagna Coutinho
 * */


public class Aula08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.println("Operadores Relacionais");

        int n1 = 0, n2 = 0;

        System.out.println("N�mero 1 = ");
        n1 = input.nextInt();

        System.out.println("N�mero 2 = ");
        n2 = input.nextInt();

        boolean iguais = n1 == n2;

        boolean diferentes = n1 != n2;

        boolean primeiroMaiorQueSegundo = n1 > n2;

        boolean primeiroMaiorIgualQueSegundo = n1 >= n2;

        boolean primeiroMenorQueSegundo = n1 < n2;

        boolean primeiroMenorIgualQueSegundo = n1 <= n2;


        System.out.println("Iguais ? " + iguais);

        System.out.println("Diferente ? " + diferentes);

        System.out.println("Primeiro maior que segundo ? " + primeiroMaiorQueSegundo);

        System.out.println("Primeiro maior igual que segundo ? " + primeiroMaiorIgualQueSegundo);

        System.out.println("Primeiro menor que segundo ? " + primeiroMenorQueSegundo);

        System.out.println("Primeiro menor igual que segundo ? " + primeiroMenorIgualQueSegundo);

        System.out.println();

        System.out.println("Operadores L�gicos");

        boolean a = false;
        boolean b = !a;
        System.out.println("Operador Not ? " + b);

        boolean c = true;
        boolean d = true;
        boolean e = c && d;
        System.out.println("Operador And ? " + e);

        boolean f = false;
        boolean g = false;
        boolean h = f || g;
        System.out.println("Operador Or ? " + h);

        System.out.println();

        System.out.println("Prioridade de Operadores");

        //Nessa express�o resolvemos primeiro os operadores aritm�ticos
        boolean v = true;

        boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;

        System.out.println("Resultado = " + x);
        
        input.close();
	
	}

}
