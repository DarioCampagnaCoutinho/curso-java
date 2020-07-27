package com.java.modulo18.jdbc.aulas.aula03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Exemplo8 {

	public static void main(String[] args) {
		
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "8d6a2t4g");
			System.out.println("Conectado com Sucesso");
			
			//Inserir ao Banco
			CallableStatement cs = cn.prepareCall("{call prc_numero_descricao(?, ?)}");
			cs.setInt(1, 1234);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.executeUpdate();
			String result = cs.getString(2);
			System.out.println(result);
			cs.close();
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
