package com.java.modulo09.consencap.exercicios.exercicio03;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = "", telefone = "", email = "";

        System.out.println("Nome:");
        nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as Informações" + (i + 1));
            Contato c = new Contato();

            System.out.println("Nome:");
            nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Telefone:");
            telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Email:");
            email = scan.nextLine();
            c.setEmail(email);
            
            contatos[i] = c;

        }
        agenda.setContatos(contatos);
        
        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }

}
