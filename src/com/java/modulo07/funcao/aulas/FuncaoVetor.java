package com.java.modulo07.funcao.aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class FuncaoVetor {

    public static int TamanhoVetor() {
        int tamanho = 0;

        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho = "));

        return tamanho;
    }

    public static double[] Vetor(int tamanho) {
        double[] vetor = new double[tamanho];

        return vetor;
    }
    
    public static double [] LerVetor(double [] vetor){
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Elemento ["+i+"]"));
        }
        return vetor;
    }
    
    public static double Somar(double [] vetor){
        double soma = 0;
        for(int i = 0; i < vetor.length;i++){
            soma += vetor[i];
        }
        return soma;
    }
    
    public static double Verifica_Menor_Numero(double [] vetor){
        double menor = Double.MAX_VALUE;
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
    
    public static double Verifica_Maior_Numero(double [] vetor){
        double maior = Double.MIN_VALUE;
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
    
    public static void MostrarVetor(double[] vetor){
        for(int i = 0; i < vetor.length;i++){
            JOptionPane.showMessageDialog(null,"Posição ["+i+"] = "+ vetor[i]);
        }
    }
    
    public static void MostrarSoma(double soma){
        JOptionPane.showMessageDialog(null, "Soma = "+soma);
    }
    
    public static void MostrarMenor(double menor){
        JOptionPane.showMessageDialog(null, "Menor = "+menor);
    }
    
    public static void MostrarMaior(double maior){
        JOptionPane.showMessageDialog(null, "Maior = "+maior);
    }

    public static void main(String[] args) {
        
        int tamanho = TamanhoVetor();
        double [] vetor = Vetor(tamanho);
        double [] vetor1 = LerVetor(vetor);
        double soma = Somar(vetor1);
        double menor = Verifica_Menor_Numero(vetor1);
        double maior = Verifica_Maior_Numero(vetor1);
        MostrarSoma(soma);
        MostrarMenor(menor);
        MostrarMaior(maior);
        MostrarVetor(vetor1);

    }

}
