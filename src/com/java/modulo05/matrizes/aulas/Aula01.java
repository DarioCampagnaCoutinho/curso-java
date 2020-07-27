package com.java.modulo05.matrizes.aulas;

/*
 * Aula 01, Iniciando com matrizes, mostrando posições de cada elemento.
 *
 * */


public class Aula01 {

    public static void main(String[] args)
    {
        System.out.println("=== Matriz -> 3 x 3 ===!");

        double [][] x = {{10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};



        for(int i = 0; i < x.length;++i){
            for(int j = 0; j < x[i].length;++j){
                System.out.println(i +" | "+j+" = "+x[i][j]+"\t");

            }
            System.out.println("\n");

        }
    }
}
