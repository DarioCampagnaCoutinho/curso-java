package com.java.modulo18.jdbc.aulas.aula02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.sql.Date;

public class Exemplo6 {

	public static void main(String[] args) {
	
		try {
			//Carregar Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar ao Banco de Dados
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "", "");
			System.out.println("Conectado com Sucesso");
			
			//Inserir ao Banco de Datas
			
			PreparedStatement stm = cn.prepareStatement("insert into horario (data, horas, horadiaano) values (?, ?, ?)");
			Calendar calendar = Calendar.getInstance();
			calendar.set(1992, 02, 25);
			Date date = new Date(calendar.getTimeInMillis());
			calendar.set(0, 0, 0, 12, 15, 30);
			java.sql.Time time = new java.sql.Time(calendar.getTimeInMillis());
			calendar.set(1992,  02, 25, 12, 15, 30);
			Timestamp dateTime = new Timestamp(calendar.getTimeInMillis());
			
			stm.setDate(1, date);
			stm.setTime(2, time);
			stm.setTimestamp(3,dateTime);
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
		}
	}

}
