package com.java.modulo08.oo.aulas.aula02;



public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
        c1.numero = 1;
        c1.nome = "Dario Campagna";
        
        c1.depositar(100);
        c1.retirar(50);
        
        
        System.out.println("Dados da Conta: ");
        System.out.println("N�mero da Conta: "+c1.numero);
        System.out.println("Nome do Cliente: "+c1.nome);
        System.out.println("Saldo da Conta: "+c1.getSaldo());

	}

}
