package com.java.modulo18.jdbc.aulas.aula02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Exemplo2 {

	public static void main(String[] args) {
		
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "", "");
			System.out.println("Conectado com Sucesso");
			
			//Inserir ao Banco
			
			PreparedStatement stm = cn.prepareStatement("insert into funcionario (matricula, nome, salario) values (?, ?, ?)");
			stm.setInt(1, 104);
			stm.setString(2, "Marcio");
			stm.setDouble(3, 3000.50);
			stm.execute();
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
