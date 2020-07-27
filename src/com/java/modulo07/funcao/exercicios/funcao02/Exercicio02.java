package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio02 {
    
    public static double LerRaio(){
        double raio = 0;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Raio: "));
        return raio;
    }
    
    public static double Area_Circulo(double raio){
        
        return (Math.PI) * (Math.pow(raio, 2));
    }
    
    public static double Perimetro_Circulo(double raio){
        
        return Math.PI * 2 * raio;
    }
    
    public static void Mostrar_Area_Circulo(double area){
        JOptionPane.showMessageDialog(null,"Área do Circulo: "+ area);
    }
    
    public static void Mostrar_Perimetro_Circulo(double perimetro){
        JOptionPane.showMessageDialog(null,"Perimetro do Circulo: "+ perimetro);
    }
    
    public static void main(String[] args) {
        
        double r = LerRaio();
        double area_circulo = Area_Circulo(r);
        double perimetro_circulo = Perimetro_Circulo(r);
        Mostrar_Area_Circulo(area_circulo);
        Mostrar_Perimetro_Circulo(perimetro_circulo);
        
    }
    
}
