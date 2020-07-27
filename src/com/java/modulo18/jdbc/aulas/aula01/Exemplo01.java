package com.java.modulo18.jdbc.aulas.aula01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Exemplo01 {

	public static void main(String[] args) {
		
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "", "");
			System.out.println("Conectado com Sucesso");
			
			//Inserir ao Banco
			Statement stm = cn.createStatement();
			stm.executeUpdate("insert into profissao (prof_nome) values ('Vendedor')");
			stm.close();
			cn.close();
			System.out.println("Conex�o Encerrada com Sucesso");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar");
			e.printStackTrace();
		}catch(SQLException e){
			System.out.println("Erro ao Conectar");
			e.printStackTrace();
		}

	}

}
