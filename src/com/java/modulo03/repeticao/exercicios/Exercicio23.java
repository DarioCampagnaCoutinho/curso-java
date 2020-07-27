package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 23, fazendo calculo de salário de alguns funcionários.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio23 {

    public static void main(String[] args) {

        double salario = 0, salarioLiquido = 0, totalFolhaPagamento = 0, totalImpostoRenda = 0;
        int descontoInss = 0;

        for(int i = 0; i < 2; i++){

            salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário : "));

            totalFolhaPagamento += salario;

            if(salario <= 912){
                descontoInss = 8;
            }else if(salario > 912  && salario <= 1500){
                descontoInss = 9;
            }else if(salario > 1500  && salario <= 3340){
                descontoInss = 11;
            }else{
                salarioLiquido = salario - 350;
            }

            salarioLiquido = salario - (salario / 100) * descontoInss;
            
            JOptionPane.showMessageDialog(null, "Salário : " + salario);
            JOptionPane.showMessageDialog(null, "Salário Liquido : " + salarioLiquido);

        }

        JOptionPane.showMessageDialog(null,"Total da Folha de Pagamento = R$ " + totalFolhaPagamento);

    }
}
