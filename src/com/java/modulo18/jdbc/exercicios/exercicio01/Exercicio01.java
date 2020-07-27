package com.java.modulo18.jdbc.exercicios.exercicio01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Exercicio01 {

    static Scanner ler = new Scanner(System.in);
    static Connection Con;

    public static void main(String[] args) {

        String Url = "jdbc:mysql://127.0.0.1:3306/contatodb";
        String Drive = "org.gjt.mm.mysql.Driver";
        String Usuario = "";
        String Senha = "";

        try {
            Class.forName(Drive);
            Con = DriverManager.getConnection(Url, Usuario, Senha);
            System.out.println("Conectato");
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Erro" + ex.getMessage());

        }

        Salvar();
        //Pesquisar();
        //Editar();
        //Excluir();
        //Listar();
    }

    public static void Salvar() {

        try {
            System.out.println("Nome: ");
            String nome = ler.next();
            String sql = "insert into contato(nome) values (?)";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();

        } catch (SQLException ex) {

        }

    }

    public static void Listar() {

        try {
            String sql = "select * from contato";
            PreparedStatement pst = Con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--");
            }
        } catch (SQLException ex) {

        }

    }

    public static void Pesquisar() {

        try {
            System.out.println("Nome:");
            String nome = ler.next();
            String sql = "select * from contato where nome like '%"+nome+"%' ;";
            PreparedStatement pst = Con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
                System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--");
            }
        } catch (SQLException ex) {

        }

    }

    public static void Editar() {

        try {
            System.out.println("Digite o código");
            int codigo = ler.nextInt();

            System.out.println("Digite o novo nome:");
            String nome = ler.next();

            String sql = "update contato set nome = ? where codigo = ?";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setInt(2, codigo);
            pst.execute();
        } catch (SQLException ex) {

        }

    }

    public static void Excluir() {

        try {
            System.out.println("Digite o código a ser excluido: ");
            int codigo = ler.nextInt();
            String sql = "delete from contato where codigo = ?";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setInt(1, codigo);
            pst.execute();
        } catch (SQLException ex) {

        }

    }


    
}
