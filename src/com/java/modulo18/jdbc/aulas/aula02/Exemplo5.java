package com.java.modulo18.jdbc.aulas.aula02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exemplo5 {

	public static void main(String[] args) {
		
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "", "");
			System.out.println("Conectado com Sucesso");
			
			//Pesquisar ao Banco
			
			PreparedStatement stm = cn.prepareStatement("select * from funcionario");
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				System.out.println("M�tricula: "+rs.getInt("matricula")+" Nome: "
			    +rs.getString("nome")+" S�lario:"+rs.getDouble("salario"));
			}
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
