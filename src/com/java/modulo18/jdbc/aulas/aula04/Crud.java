package com.java.modulo18.jdbc.aulas.aula04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Crud {
	
	static Connection cn = null;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");
		    cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "8d6a2t4g");
			System.out.println("Conectado com Sucesso");
			cn.getAutoCommit();
			cn.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		while (true) {
			System.out.println("****Menu****");
			System.out.println("0-Sair");
			System.out.println("1-Cadastrar");
			System.out.println("2-Listar");
			System.out.println("Op��o: ");
			String op = scan.next();

			switch (op) {
			case "0":
				System.exit(0);
				break;
			case "1":
				
				System.out.println("Digite � M�tricula: ");
				int matricula = scan.nextInt();
				System.out.println("Digite o Nome: ");
				String nome = scan.next();
				System.out.println("Digite o S�lario:");
				double salario = scan.nextDouble();
				try {
					PreparedStatement stm = cn
							.prepareStatement("insert into funcionario (matricula, nome, salario) values (?, ?, ?)");
					stm.setInt(1, matricula);
					stm.setString(2, nome);
					stm.setDouble(3, salario);
					stm.execute();
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case "2":
			    
				try {
					PreparedStatement stm = cn.prepareStatement("select * from funcionario");
					ResultSet rs = stm.executeQuery();
					while (rs.next()) {
						System.out.println("M�tricula: " + rs.getInt("matricula") + " Nome: " + rs.getString("nome")
								+ " S�lario:" + rs.getDouble("salario"));
					}
					stm.close();
					
				} catch (SQLException e) {
                    e.printStackTrace();
				}
				break;

			default:
				break;
			}

		}

	}

}
