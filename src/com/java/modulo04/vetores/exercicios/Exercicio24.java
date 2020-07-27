package com.java.modulo04.vetores.exercicios;

import java.util.Random;
/*
* Execicío 24, cartas do baralho.
*
* Dario Campagna Coutinho
* */

public class Exercicio24 {

    public static void main(String[] args)
    {
        System.out.println("BARALHO!");

        String [] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String [] nipes = {"Espadas", "Paus", "Copas", "Ouros" };

        Random r = new Random();

        int indiceface = r.nextInt(faces.length);
        String face = faces [indiceface];

        int indicenipe = r.nextInt(nipes.length);
        String nipe = nipes [indicenipe];

        String carta = face+" "+nipe;
        System.out.println (carta);

    }
}
