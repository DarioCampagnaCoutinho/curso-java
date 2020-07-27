package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 17, calculando salário.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHoraTrabalhada = 0, salario = 0, fgts = 0, sindicato = 0, descontos = 0, impostoRenda = 0;
        int quantidadeHorasMes = 0, quantidadeHorasDia = 0, diasTrabalhados = 0;

        System.out.println("Dias trabalhados = ");
        diasTrabalhados = scanner.nextInt();
        System.out.println("Qunatidade de horas por dia = ");
        quantidadeHorasDia = scanner.nextInt();
        System.out.println("Valor da hora = ");
        valorHoraTrabalhada = scanner.nextDouble();

        quantidadeHorasMes = diasTrabalhados * quantidadeHorasDia;
        salario = quantidadeHorasMes * valorHoraTrabalhada;

        if (salario <= 900){
            fgts = salario / 100 * 11;
            sindicato = salario / 100 * 3;
            descontos = fgts + sindicato;
            System.out.println("Voçê está isento de pagar imposto de renda. Salário é menor ou igual a R$ 900.00");
            System.out.println("Quantidade de horas trabalhadas no mês = " + quantidadeHorasMes + " h/mês");
            System.out.println("Salário = R$ " + (salario));
            System.out.println("Desconto FGTS R$ = " + fgts);
            System.out.println("Desconto SINDICATO R$ = " + sindicato);
            System.out.println("Total de DESCONTOS R$ = " + descontos);
            System.out.println("Salário com desconto = R$ " + (salario - descontos));
        }else if(salario > 900 && salario <= 1500){
            fgts = salario / 100 * 11;
            sindicato = salario / 100 * 3;
            impostoRenda = salario / 100 * 5;
            descontos = fgts + sindicato + impostoRenda;
            System.out.println("Voçê está isento de pagar imposto de renda. Salário é menor ou igual a R$ 900.00");
            System.out.println("Quantidade de horas trabalhadas no mês = " + quantidadeHorasMes + " h/mês");
            System.out.println("Salário = R$ " + (salario));
            System.out.println("Desconto FGTS R$ = " + fgts);
            System.out.println("Desconto SINDICATO R$ = " + sindicato);
            System.out.println("Desconto IR R$ = " + impostoRenda);
            System.out.println("Total de DESCONTOS R$ = " + descontos);
            System.out.println("Salário com desconto = R$ " + (salario - descontos));
        }
        
        scanner.close();
    }
}
