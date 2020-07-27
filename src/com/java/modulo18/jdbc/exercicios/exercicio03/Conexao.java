package com.java.modulo18.jdbc.exercicios.exercicio03;

import java.sql.*;

/**
 *
 * @author dario
 */
public class Conexao {
    
    private final String url = "jdbc:mysql://127.0.0.1:3306/contatodb";
    private final String driver = "org.gjt.mm.mysql.Driver";
    private final String usuario = "";
    private final String senha = "";
    static Connection Con;
    

    public Conexao() {

        try {
            Class.forName(driver);
            Con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado ao Banco de Dados Agenda");
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Erro ao Conectar ao Banco de Dados Agenda");

        }
    }

    public static Connection getConnection() {

        if (Con == null) {
            new Conexao();

        }

        return Con;
    }

    public static void closeConnection() {

        try {
            if (!Con.isClosed()) {
                Con.close();
            }

        } catch (Exception ex) {

        }

    }


    
}
