package com.java.modulo10.heranca.aulas.aula02;
import java.util.*;


public class TesteGeometria {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = ler.nextDouble();
		
		FiguraGeometrica f = new Quadrado(lado);
		System.out.println(f.getArea());
		
		System.out.println("Digite o valor do raio: ");
		double raio = ler.nextDouble();
		
		f = new Circulo(raio);
		System.out.println(f.getArea());
		
		System.out.println("Digite o valor da base: ");
		double base = ler.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double altura = ler.nextDouble();
		
		f = new Triangulo(base, altura);
		System.out.println(f.getArea());
	}
}
