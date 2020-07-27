package com.java.modulo18.jdbc.aulas.aula02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo7 {

	public static void main(String[] args) {
		
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "", "");
			System.out.println("Conectado com Sucesso");
			
			//Inserir foto ao Banco
			
			PreparedStatement stm = cn.prepareStatement("insert into foto (imagem) values (?)");
			stm.setBinaryStream(1, new FileInputStream("C:\\Users\\dario\\OneDrive\\Documentos"
					+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\Imagem\\Trator7R.jpg"));
			stm.executeUpdate();
			stm.close();
			cn.close();
			System.out.println("Conex�o Encerrada com Sucesso");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar");
			e.printStackTrace();
		}catch(SQLException e){
			System.out.println("Erro ao Conectar");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
