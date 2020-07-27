package com.java.modulo07.funcao.aulas;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class ProgressaoAritmetica {
    
    static Scanner ler = new Scanner(System.in);
    
    public static double Ler(){
        return ler.nextDouble();
    }
    
    public static double CalcularRazao(double a2, double a1){
        return a2 - a1;
    }
    
    public static double CalcularTermoGeral(double a1, double n, double r){
        return a1 + (n - 1) * r;
    }
    
    public static double CalcularSomaGeral(double a1, double an, double n){
        return ((a1 + an) * n) / 2; 
    }
    
    public static void main(String[] args) {
        
        double a2 = 0, a1 = 0, n = 0, r = 0, an = 0, sn = 0;
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("*****Razão************************");
        System.out.println("Digite o Segundo Termo: ");
        a2 = Ler();
        System.out.println("Digite o Primeiro Termo: ");
        a1 = Ler();
        r = CalcularRazao(a2, a1);
        System.out.printf("Razão = %.3f\n",r);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("*****Termo Geral**************");
        System.out.println("Digite o Número de Termo: ");
        n = Ler();
        an = CalcularTermoGeral(a1, n, r);
        System.out.printf("Termo Geral = %.3f\n",an);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("******Soma Geral************");
        sn = CalcularSomaGeral(a1, an, n);
        System.out.printf("Soma Geral = %.3f\n",sn);
        
        
    }
    
}
