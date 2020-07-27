package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 04, calculando forma de pagamento de uma compra.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio04 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double valorDaCompra = 0, desconto = 0, valorDaCompraAvista = 0, valorDaCompraCheque = 0, parceladoTresVezes = 0, parceladoDozeVezes = 0, pagamentoDozeVezes = 0;
        int parceladoTres = 3, parceladoDoze = 12;
        String formaDePagamento = "";

        System.out.println("Digite o valor da compra: ");
        valorDaCompra = input.nextDouble();

        System.out.println("Digite a forma de pagamento: ");
        formaDePagamento = input.next();

        System.out.println("Valor total da compra = " + valorDaCompra + " R$");

        if(formaDePagamento.equals("avista")){
            valorDaCompraAvista = valorDaCompra - (valorDaCompra / 100 * 15);
            desconto = valorDaCompra - valorDaCompraAvista;
            System.out.println("Valor total da compra à vista = " + valorDaCompraAvista + " R$");
            System.out.println("O desconto foi de = "+ desconto + " R$");
        }else if(formaDePagamento.equals("cheque")){
            valorDaCompraCheque = valorDaCompra - (valorDaCompra / 100 * 10);
            desconto = valorDaCompra - valorDaCompraCheque;
            System.out.println("Valor da Compra com Cheque = " + valorDaCompraCheque + " R$");
            System.out.println("O desconto foi de = "+ desconto + " R$");
        }else if(formaDePagamento.equals("tresvezes")){
            parceladoTresVezes = valorDaCompra / parceladoTres;
            System.out.println("Parcelado em três vezes, não tem desconto = " + valorDaCompra + " R$");
            System.out.println("Parcelado em "+ parceladoTres + " vezes, o valor das parcelas é de = " + parceladoTresVezes);
        } else if(formaDePagamento.equals("dozevezes")){
            pagamentoDozeVezes = valorDaCompra + (valorDaCompra / 100 * 8);
            parceladoDozeVezes = pagamentoDozeVezes / parceladoDoze;
            System.out.println("Parcelado em doze vezes, não tem desconto = " + pagamentoDozeVezes + " R$");
            System.out.println("Parcelado em "+ parceladoDoze + " vezes, o valor das parcelas é de = " + parceladoDozeVezes);
        }else{
            System.out.println("Nenhuma das opções foi selecionada, execute o programa novamente");
        }
        input.close();
    }
}
