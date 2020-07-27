package com.java.modulo08.oo.exercicios.exercicio10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta conta = new Conta();
        conta.cliente = "Dario";
        conta.saldo = 5000;

        conta.exibeSaldo();
        conta.saca(500);
        conta.exibeSaldo();

        conta.deposita(900);
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "Darius";
        destino.saldo = 15000;

        destino.exibeSaldo();

        conta.transferePara(destino, 1500);
        conta.exibeSaldo();
        destino.exibeSaldo();

    }
}
