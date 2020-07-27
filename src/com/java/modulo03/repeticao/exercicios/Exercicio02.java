package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 02, validação com do while.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio02 {
    
    public static void main(String[] args){

        boolean infoValidas = false;
        String nomeUser;
        String senha;
        
        do {

            nomeUser = JOptionPane.showInputDialog("Nome:");

            senha = JOptionPane.showInputDialog("Senha:");
            
            if (nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                JOptionPane.showMessageDialog(null,"Senha igual a usuário, digite novamente.");
            } else {
                infoValidas = true;
                JOptionPane.showMessageDialog(null,"Senha e usuários válidos.");
            }
            
        } while (!infoValidas);
        
    }
}
