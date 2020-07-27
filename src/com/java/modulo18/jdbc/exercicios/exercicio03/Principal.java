package com.java.modulo18.jdbc.exercicios.exercicio03;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Principal {

    static Scanner ler = new Scanner(System.in);
    static Conexao Con = new Conexao();
    static Agenda Ag = new Agenda();
    static Dao D = new Dao();

    public static String Menu() {

        String acao = "";
        System.out.println("-------------Agenda------------");
        System.out.println("1-Cadastrar\n");
        System.out.println("2-Editar\n");
        System.out.println("3-Excluir\n");
        System.out.println("4-Listar todos Contatos\n");
        System.out.println("5-Listar um Contato\n");
        acao = ler.next();

        return acao;
    }

    public static void Operacao(String acao) {

        switch (acao) {
            case "1":
                Cadastro();
                break;
            case "2":
                Editar();
                break;
            case "3":
                Excluir();
                break;
            case "4":
                ListarContatos();
                break;
            case "5":
                String p = "";
                PesquisaContato(p);
                break;

        }
    }

    public static void main(String[] args) {

        String acao = "";
        while (true) {
            acao = Menu();
            Operacao(acao);
        }

    }

    public static void Cadastro() {
        System.out.println("Nome: ");
        Ag.setNome(ler.next());
        System.out.println("Email: ");
        Ag.setEmail(ler.next());
        System.out.println("Telefone: ");
        Ag.setTelefone(ler.next());
        D.SalvarContato(Ag);

    }

    public static void Excluir() {

        System.out.println("Digite o Código a ser Excluido");
        Ag.setCodigo(ler.nextInt());
        D.ExcluirContato(Ag);

    }

    public static void Editar() {
        System.out.println("Digite o código");
        Ag.setCodigo(ler.nextInt());
        System.out.println("Novo Nome: ");
        Ag.setNome(ler.next());
        System.out.println("Novo Email: ");
        Ag.setEmail(ler.next());
        System.out.println("Novo Telefone: ");
        Ag.setTelefone(ler.next());
        D.EditarContato(Ag);

    }

    public static void ListarContatos() {

        int quantidade = 0;
        List<Agenda> minhalista = D.ListarContatos();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------Lista de Contatos--------------------------------------------------");
        for (Agenda agenda : minhalista) {
            System.out.println("Código:" + agenda.getCodigo() + " Nome: " + agenda.getNome() + " Email: " + agenda.getEmail() + " Telefone:" + agenda.getTelefone());
            quantidade++;

        }
        System.out.println("Total de Contatos: " + quantidade);
    }

    public static void PesquisaContato(String pesquisa) {

        System.out.println("Digite o nome: ");
        pesquisa = ler.next();

        List<Agenda> minhalista = D.PesquisarContato(pesquisa);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------Lista de Contatos--------------------------------------------------");
        for (Agenda agenda : minhalista) {
            System.out.println("Código:" + agenda.getCodigo() + " Nome: " + agenda.getNome() + " Email: " + agenda.getEmail() + " Telefone:" + agenda.getTelefone());

        }
    }

}
