package com.java.modulo08.oo.exercicios.exercicio06;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Na fórmula de Bhaskara utilizaremos somente os coeficientes. Veja:



		1º passo: determinar o valor do discriminante ou delta (?)

		∆ = b² – 4 * a * c
			∆ = (–2)² – 4 * 1 * (–3)
			∆ = 4 + 12
			∆ = 16

		2º passo



		Os resultados são x’ = 3 e x” = –1.*/
        System.out.println("Equação Quadratica!\n");

        Scanner leitor = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite os Coeficientes:\n ");

        System.out.println("A: ");
        a = leitor.nextDouble();

        System.out.println("B: ");
        b = leitor.nextDouble();

        System.out.println("C: ");
        c = leitor.nextDouble();

        CalcularEquacaoBaskara CEB = new CalcularEquacaoBaskara();

        CEB.CalcularEquacao(a, b, c);

    }
}
