package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;
/*
 * Exercicío 17, cadastro de pessoas.
 * Se opção é igual a 1, o usuário deve continuar cadastrando;
 * Se opção é diferente de 1 o programa encerra;
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio17 {

    public static void main(String [] args){

        String nome, sexo, escolaridade;
        int idade = 0, opcao, contIdadeMasculino = 0, contIdadeFeminino = 0, contSexoMasculino = 0, contSexoFeminino = 0;
        while (true){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção :"));
            if(opcao == 1) {
                nome = JOptionPane.showInputDialog("Digite um nome :");
                while(true) {
                    sexo = JOptionPane.showInputDialog("Sexo : ");
                    if (sexo.equals("m") || sexo.equals("M")) {
                        contSexoMasculino += 1;
                        contIdadeMasculino += 1;
                        break;
                    }else if (sexo.equals("f") || sexo.equals("F")){
                        contSexoFeminino += 1;
                        contIdadeFeminino += 1;
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Digite m ou M para masculino e f ou F para feminino");
                    }
                }
                while(true) {
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade :"));
                    if(idade >= 18 && idade <= 70){
                        break;
                    }else {
                        JOptionPane.showMessageDialog(null, "Digite Novamente. Idade entre 18 e 70");
                    }
                }
                if (idade == 30) {
                    contIdadeMasculino += 1;
                }
                escolaridade = JOptionPane.showInputDialog("Escolaridade : ");
            }

            else{
                JOptionPane.showMessageDialog(null, "Programa Encerrado!!");
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Candidatos Homens = " + contSexoMasculino);
        JOptionPane.showMessageDialog(null, "Candidatas Mulheres = " + contSexoFeminino);
        JOptionPane.showMessageDialog(null, "Candidatos Homens = " + contSexoMasculino);
        JOptionPane.showMessageDialog(null, "Candidatas Mulheres = " + contSexoFeminino);
    }
}
