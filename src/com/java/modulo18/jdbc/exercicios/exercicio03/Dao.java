package com.java.modulo18.jdbc.exercicios.exercicio03;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dario
 */
public class Dao {

    Conexao Con;
    Agenda Ag;

    public Dao() {

        Con = new Conexao();
        Ag = new Agenda();

    }

    public boolean SalvarContato(Agenda Ag) {

        try {
            String SQLInsertion = "insert into agenda (nome, email, telefone) values (?,?,?)";
            PreparedStatement pst = Con.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Ag.getNome());
            pst.setString(2, Ag.getEmail());
            pst.setString(3, Ag.getTelefone());

            pst.execute();
            System.out.println("Contato Cadastrado com Sucesso");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Cadastrar Contato" + ex.getMessage());

        }
        return false;
    }

    public boolean EditarContato(Agenda Ag) {

        try {
            String SQLInsertion = "update agenda set nome = ?, email = ?, telefone = ? where codigo = ?";
            PreparedStatement pst = Con.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, Ag.getNome());
            pst.setString(2, Ag.getEmail());
            pst.setString(3, Ag.getTelefone());
            pst.setInt(4, Ag.getCodigo());
            pst.execute();
            System.out.println("Contato Editado com Sucesso");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Editar Contato" + ex.getMessage());

        }
        return false;
    }

    public void ExcluirContato(Agenda Ag) {

        try {
            String SQLInsertion = "delete * from agenda where codigo = ?";
            PreparedStatement pst = Con.getConnection().prepareStatement(SQLInsertion);
            pst.setInt(1, Ag.getCodigo());
            pst.execute();
            System.out.println("Contato Excluido com Sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao Excluir Contato" + ex.getMessage());

        }

    }

    public List<Agenda> ListarContatos() {

        List<Agenda> lista = new ArrayList<Agenda>();

        try {

            String SQLInsertion = "select * from agenda";
            PreparedStatement pst = Con.getConnection().prepareStatement(SQLInsertion);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Agenda Ag = new Agenda();

                Ag.setCodigo(rs.getInt("codigo"));
                Ag.setNome(rs.getString("nome"));
                Ag.setEmail(rs.getString("email"));
                Ag.setTelefone(rs.getString("telefone"));

                lista.add(Ag);
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao Pesquisar os Contatos");
        }

        return lista;

    }

    public List<Agenda> PesquisarContato(String pesquisa) {

        List<Agenda> lista = new ArrayList<Agenda>();

        try {
            //"select * from agenda where nome like '%"+pesquisa+"%';
            String SQLInsertion = "select * from agenda where nome like '%" + pesquisa + "%';";
            PreparedStatement pst = Con.getConnection().prepareStatement(SQLInsertion);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                Agenda Ag = new Agenda();

                Ag.setCodigo(rs.getInt("codigo"));
                Ag.setNome(rs.getString("nome"));
                Ag.setEmail(rs.getString("email"));
                Ag.setTelefone(rs.getString("telefone"));

                lista.add(Ag);

            }

        } catch (SQLException ex) {
            System.err.println("Erro ao Pesquisar Contato" + ex.getMessage());
        }
        return lista;
    }

}
