package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 16, calculando salário.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio16 {

    public static int VINTE_PORCENTO = 20;
    public static int QUINZE_PORCENTO = 15;
    public static int DEZ_PORCENTO = 10;
    public static int CINCO_PORCENTO = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = 0, aumento = 0;

        System.out.println("Digite o salário : ");
        salario = scanner.nextDouble();

        if(salario <= 280){
            System.out.println("Salário Atual = R$ " + salario);
            aumento = salario * VINTE_PORCENTO / 100;
            salario += aumento;
            System.out.println("Percentual aplicado = " + VINTE_PORCENTO + " %");
            System.out.println("Aumento de = R$ " + aumento);
            System.out.println("Salário com aumento = R$ " + salario);
        }else if(salario > 280 && salario <= 700){
            System.out.println("Salário Atual = R$ " + salario);
            aumento = salario * QUINZE_PORCENTO / 100;
            salario += aumento;
            System.out.println("Percentual aplicado = " + QUINZE_PORCENTO + " %");
            System.out.println("Aumento de = R$ " + aumento);
            System.out.println("Salário com aumento = R$ " + salario);
        }else if(salario > 700 && salario <= 1500){
            System.out.println("Salário Atual = R$ " + salario);
            aumento = salario * DEZ_PORCENTO / 100;
            salario += aumento;
            System.out.println("Percentual aplicado = " + DEZ_PORCENTO + " %");
            System.out.println("Aumento de = R$ " + aumento);
            System.out.println("Salário com aumento = R$ " + salario);
        }else {
            System.out.println("Salário Atual = R$ " + salario);
            aumento = salario * CINCO_PORCENTO / 100;
            salario += aumento;
            System.out.println("Percentual aplicado = " + CINCO_PORCENTO + " %");
            System.out.println("Aumento de = R$ " + aumento);
            System.out.println("Salário com aumento = R$ " + salario);
        }
        
        scanner.close();

    }
}
