package com.java.modulo02.condicional.aulas;

import javax.swing.*;

/*
 * Aula 01, primeiro exemplo if e else e JoptionPane.
 *
 * Dario Campagna Coutinho
 * */


public class Aula01 {

    public static void main(String []args){

        float salario, bonus;
        int temp;

        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual sálario:"));
        temp = Integer.parseInt(JOptionPane.showInputDialog("A quanto tempo está na empresa:"));

        if(temp >= 5){
            bonus = salario * 0.20f;
        }else{
            bonus = salario * 0.10f;
        }
        JOptionPane.showMessageDialog(null, "O valor do bônus é = " + bonus);
    }
}
