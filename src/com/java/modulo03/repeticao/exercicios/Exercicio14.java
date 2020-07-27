package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 14, caixa supermercado.
 *
 * Dario Campagna Coutinho
 * */


import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        int quantidade = 1;
        int quantidadeTotal = 0;
        float valorUnitario = 0;
        float valorProduto = 0;
        float valorTotal = 0;
        boolean status = false;

        System.out.println("Digite 0 na quantidade para finalizar a compra");


        while(!status){

            System.out.println("Digite a quantidade de item: ");
            quantidade = leitor.nextInt();

            if(quantidade > 0){

                System.out.println("Digite o preço unitário desse item: ");
                valorUnitario = leitor.nextFloat();

                valorProduto = quantidade * valorUnitario;
                valorTotal = valorTotal + valorProduto;
                quantidadeTotal = quantidadeTotal + quantidade;

            }else{
                status=true;
            }

        }
        System.out.println("Quantidade total: " + quantidadeTotal);
        System.out.println("Valor total da Compra: " + valorTotal);


    }

}
