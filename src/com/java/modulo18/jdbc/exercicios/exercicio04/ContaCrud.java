package com.java.modulo18.jdbc.exercicios.exercicio04;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaCrud {

    public void criar(Connection con, Conta conta) {

        try {
            String SQLInsertion = "insert into conta values (?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(SQLInsertion);
            stm.setInt(1, conta.numero);
            stm.setString(2, conta.cliente);
            stm.setDouble(3, conta.saldo);
            stm.execute();
            System.out.println("Salvo com Sucesso");

        } catch (SQLException ex) {
            System.out.println("Erro ao Criar");

        }

    }

    public List<Conta> Ler(Connection con) {

        List<Conta> lista = new ArrayList();
        try {
            String SQLInsertion = "select conta_numero, conta_cliente, conta_saldo from conta ";
            PreparedStatement stm = con.prepareStatement(SQLInsertion);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));

            }
            System.out.println("Salvo com Sucesso");

        } catch (SQLException ex) {
            System.out.println("Erro ao Criar");

        }

        return lista;

    }

    public void alterar(Connection con, Conta conta) {

        try {
            String SQLInsertion = "update conta set conta_saldo = ?, conta_cliente = ? where conta_numero= ?";
            PreparedStatement stm = con.prepareStatement(SQLInsertion);
            stm.setInt(1, conta.numero);
            stm.setString(2, conta.cliente);
            stm.setDouble(3, conta.saldo);
            stm.executeUpdate();
            System.out.println("Alterado com Sucesso");

        } catch (SQLException ex) {
            System.out.println("Erro ao Alteral");

        }

    }

    public void excluir(Connection con, Conta conta) {

        try {
            String SQLInsertion = "delete conta where numero = ?";
            PreparedStatement stm = con.prepareStatement(SQLInsertion);
            stm.setInt(1, conta.numero);
            stm.execute();
            System.out.println("Excluido com Sucesso");

        } catch (SQLException ex) {
            System.out.println("Erro ao Excluir");

        }

    }
}
