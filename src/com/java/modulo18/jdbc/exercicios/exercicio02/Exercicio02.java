package com.java.modulo18.jdbc.exercicios.exercicio02;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio02 {
    
    static Connection Con;

    public static void main(String[] args) {

        String Url = "jdbc:mysql://127.0.0.1:3306/contatodb";
        String Drive = "org.gjt.mm.mysql.Driver";
        String Usuario = "";
        String Senha = "";

        try {
            Class.forName(Drive);
            Con = DriverManager.getConnection(Url, Usuario, Senha);
            JOptionPane.showMessageDialog(null, "Banco de Dados" + "\nConectado");
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Erro" + ex.getMessage());

        }

        while (true) {
            String opcao = JOptionPane.showInputDialog("1-Salvar\n"
                    + "2-Listar\n"
                    + "3-Pesquisar\n"
                    + "4-Editar\n"
                    + "5-Excluir\n");
            switch (opcao) {

                case "1":
                    Salvar();
                    break;
                case "2":
                    Listar();
                    break;
                case "3":
                    Pesquisar();
                    break;
                case "4":
                    Editar();
                    break;
                case "5":
                    Excluir();
                    break;

            }
        }
    }

    public static void Salvar() {

        try {
            String nome = JOptionPane.showInputDialog("Digite o Nome: ");
            String email = JOptionPane.showInputDialog("Digite o Email: ");
            String telefone = JOptionPane.showInputDialog("Digite o Telefone: ");
            String sql = "insert into agenda(nome, email, telefone) values (?, ?, ?)";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, email);
            pst.setString(3, telefone);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar no Banco de Dados" + ex.getMessage());

        }

    }

    public static void Listar() {

        try {
            String sql = "select * from agenda";
            PreparedStatement pst = Con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Código: " + rs.getInt(1)
                        + " | Nome: " + rs.getString(2)
                        + " | Email: " + rs.getString(3)
                        + " | Telefone: " + rs.getString(4));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Contatos" + ex.getMessage());

        }

    }

    public static void Pesquisar() {

        try {
            String nome = JOptionPane.showInputDialog("Digite o Nome: ");
            String sql = "select * from agenda where nome like '%" + nome + "%' ;";
            PreparedStatement pst = Con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Código: " + rs.getInt(1)
                        + " | Nome: " + rs.getString(2)
                        + " | Email: " + rs.getString(3)
                        + " | Telefone: " + rs.getString(4));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Contatos não Existe" + ex.getMessage());

        }

    }

    public static void Editar() {

        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código:"));

            String nome = JOptionPane.showInputDialog("Digite o Novo Nome: ");
            String email = JOptionPane.showInputDialog("Digite o Novo Email: ");
            String telefone = JOptionPane.showInputDialog("Digite o Novo Telefone: ");

            String sql = "update contato set nome = ?, email = ?, telefone = ? where codigo = ?";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, email);
            pst.setString(3, telefone);
            pst.setInt(4, codigo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Editado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar no Banco de Dados" + ex.getMessage());

        }

    }

    public static void Excluir() {

        try {

            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código:"));
            String sql = "delete from contato where codigo = ?";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setInt(1, codigo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Contato Excluido do Banco de Dados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Contato" + ex.getMessage());

        }

    }


    
}
