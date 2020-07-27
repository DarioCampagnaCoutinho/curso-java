package com.java.modulo08.oo.exercicios.exercicio08;

/**
 *
 * @author dario
 */
public class Contator {

    private static int cont;

    public Contator() {
        cont++;
    }

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int obterTamanho() {
        return cont;
    }
}
