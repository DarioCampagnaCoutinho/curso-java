package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio04 {
    
    public static boolean Verifica(double nota, double frequencia){
        if(nota >= 6 && frequencia >= 75){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota = "));
        double frequencia = Double.parseDouble(JOptionPane.showInputDialog("Frequência = "));
        
        if(Verifica(nota, frequencia)){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
    
}
