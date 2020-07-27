package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio01 {
    
    public static int LerNumero(){
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número: "));
        return numero;
    }
    
    public static int Expoente(int base, int potencia){
        int resultado = 0;
        resultado = base;
        for(int i = 1; i < potencia;i++){
            resultado *= base;
        }
        return resultado;
    }
    
    public static void Mostrar(int resultado){
        JOptionPane.showMessageDialog(null, "Potência = "+ resultado);
    }
    
    public static void main(String[] args) {
        
        int base = LerNumero();
        int potencia = LerNumero();
        
        int resultado = Expoente(base, potencia);
        Mostrar(resultado);
        
    }
    
}
