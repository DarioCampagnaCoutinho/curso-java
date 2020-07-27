package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio02 {

    public static int LerNumero() {
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número: "));
        return numero;
    }

    public static void ImprimirMultiplos(int numero) {
        for (int i = 1; i <= numero; i++) {
             if(numero % i == 0){
                 JOptionPane.showMessageDialog(null, i);
             }
        }

    }
    
    public static void main(String[] args) {
        
        int numero = LerNumero();
        
        ImprimirMultiplos(numero);
    }

}
