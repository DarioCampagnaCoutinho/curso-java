package com.java.modulo18.jdbc.exercicios.exercicio04;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            String Driver = "org.postgresql.Drivers";
            String URL = "jdbc:postgresql://localhost:5432/contabanco";
            Connection con = DriverManager.getConnection(URL, "postgres", "108527");

            Conta conta1 = new Conta(1, "Dario", 1000);
            Conta conta2 = new Conta(2, "Maria", 2000);
            Conta conta3 = new Conta(3, "Ana", 1000);
            Conta conta4 = new Conta(4, "Mario", 2000);
            Conta conta5 = new Conta(5, "Darci", 1000);
            Conta conta6 = new Conta(6, "Mara", 2000);

            ContaCrud crud = new ContaCrud();
            crud.criar(con, conta1);
            crud.criar(con, conta2);
            crud.criar(con, conta3);
            crud.criar(con, conta4);
            crud.criar(con, conta5);
            crud.criar(con, conta6);

            List<Conta> contas = crud.Ler(con);
            for (Conta conta : contas) {
                System.out.println(conta);

            }

            System.out.println("Conectado com Sucesso");

        } catch (SQLException ex) {
            System.out.println("Erro ao Conectar" + ex.getMessage());
        }
    }
}
