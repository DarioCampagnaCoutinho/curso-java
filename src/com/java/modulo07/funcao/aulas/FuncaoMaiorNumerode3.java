package com.java.modulo07.funcao.aulas;

/**
 *
 * @author dario
 */
public class FuncaoMaiorNumerode3 {

    public static void main(String[] args) {

        int maior3 = maior3(1, 4, 5);
        System.out.println(maior3);
        
    }

    public static int maior2(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int maior3(int num1, int num2, int num3) {

        return maior2(maior2(num1, num2), num3);
    }
       

}
