package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio04 {
    
    public static int LerNumero(){
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe Números: "));
        return numero;
    }
    
    public static int Soma_Numeros(int n1, int n2){
        int soma = 0;
        for(int i = n1; i <= n2;i++){
            soma+= i;
        }
        return soma;
    }
    
    public static void Mostrar(int soma){
        JOptionPane.showMessageDialog(null,"Soma: "+ soma);
    }
    
    public static void main(String[] args) {
        
        int n1 = LerNumero();
        int n2 = LerNumero();
        
        int soma = Soma_Numeros(n1, n2);
        Mostrar(soma);
        
    }
    
}
