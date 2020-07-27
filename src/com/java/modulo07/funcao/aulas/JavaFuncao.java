package com.java.modulo07.funcao.aulas;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class JavaFuncao {

    static Scanner scan = new Scanner(System.in);

    public static float LerNumero() {

        float numero = 0;
        System.out.println("Digite um Número: ");
        numero = scan.nextFloat();

        return numero;
    }

    public static float Soma(float num1, float num2) {
        float soma = 0;
        soma = num1 + num2;
        return soma;
    }

    public static void Imprime(float soma) {
        System.out.println("Soma = " + soma);
    }

    public static void main(String[] args) {

        float num1 = LerNumero();
        float num2 = LerNumero();

        float x = Soma(num1, num2);

        Imprime(x);

    }

}
