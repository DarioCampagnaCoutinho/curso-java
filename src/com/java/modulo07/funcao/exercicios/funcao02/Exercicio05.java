package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio05 {
    
    public static float Ler_Lado_Poligono(){
        float lado = 0;
        lado = Float.parseFloat(JOptionPane.showInputDialog("Número de lado do Polígono:"));
        return lado;
    }
    
    public static float Medida_Lado_Poligono(){
        float medida = 0;
        medida = Float.parseFloat(JOptionPane.showInputDialog("Medida de cada lado do Polígono:"));
        return medida;
    }
    
    public static float Calcular_Poligono(float lado, float medida){
        if(lado != 3 && lado != 4 && lado != 5){
            return -1;
        }else if(lado == 3){
            return medida * 3f;
        }else if (lado == 4){
            return medida * medida;
        }else if(lado == 5){
            return medida * 5f;
        }
        return 0;
    }
    
    public static void Mostrar(float resultado){
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado);
    }
    
    public static void main(String[] args) {
        
        float lado = Ler_Lado_Poligono();
        float medida = Medida_Lado_Poligono();
        float resultado = Calcular_Poligono(lado, medida);
        Mostrar(resultado);
    }
    
}
