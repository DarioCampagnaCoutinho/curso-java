package com.java.modulo08.oo.exercicios.exercicio06;

public class CalcularEquacaoBaskara {

    double x1, x2, delta;

    public void CalcularEquacao(double a, double b, double c) {

        if (a == 0) {
            System.out.println("Equação Inválida!!");

        }

        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta Negativo, Equação Inválida-> Delta = " + delta);

        } else {

            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.println("Delta: " + delta);
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);

        }

    }
}
