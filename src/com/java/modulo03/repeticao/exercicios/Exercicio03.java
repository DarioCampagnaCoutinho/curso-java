package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 03, validação com do while.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio03 {
    
    public static void main(String[] args){
        
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            
            nome = JOptionPane.showInputDialog("Nome:");
            
            if (nome.length() >= 3){
                infoValida = true;
            } else {
                JOptionPane.showMessageDialog(null,"Nome precisa no mínimo 3 caracteres.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                JOptionPane.showMessageDialog(null,"Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {

            salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
            
            if (salario > 0){
                infoValida = true;
            } else {
                JOptionPane.showMessageDialog(null,"Salário precisa ser maior que 0.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            sexo = JOptionPane.showInputDialog("Sexo:");
            
            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                JOptionPane.showMessageDialog(null,"Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            
            estadoCivil = JOptionPane.showInputDialog("Estado Civil:");
            
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                JOptionPane.showMessageDialog(null,"Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);

        JOptionPane.showMessageDialog(null, "As seguintes informações foram coletadas:");
        JOptionPane.showMessageDialog(null,"Nome: " + nome);
        JOptionPane.showMessageDialog(null,"Idade: " + idade);
        JOptionPane.showMessageDialog(null,"Salário: " + salario);
        JOptionPane.showMessageDialog(null,"Sexo: " + sexo);
        JOptionPane.showMessageDialog(null,"Estado Civil: " + estadoCivil);
        
    }
}
