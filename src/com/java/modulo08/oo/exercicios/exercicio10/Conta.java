package com.java.modulo08.oo.exercicios.exercicio10;

public class Conta {

    String cliente;
    double saldo;

    public void exibeSaldo() {

        System.out.println("O cliente " + cliente + "possui um saldo" + saldo);

    }

    public void saca(double valor) {

        saldo -= valor;

    }

    public void deposita(double valor) {

        saldo += valor;
    }

    public void transferePara(Conta destino, double valor) {

        this.saca(valor);
        destino.deposita(valor);
    }
}
