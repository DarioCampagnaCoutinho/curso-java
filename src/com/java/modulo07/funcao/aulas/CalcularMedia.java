package com.java.modulo07.funcao.aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class CalcularMedia {

    public static double LerNota() {
        double nota = 0;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Notas: "));

        return nota;
    }
    
    public static double Media(double a, double b, double c){
        
        return (a + b + c) / 3;
    }
    
    public static void Mostrar(double media){
        JOptionPane.showMessageDialog(null, "Média = "+ media);
    }
    public static void main(String[] args) {
        
        double a = LerNota();
        double b = LerNota();
        double c = LerNota();
        
        double media = Media(a, b, c);
        Mostrar(media);

    }

}
