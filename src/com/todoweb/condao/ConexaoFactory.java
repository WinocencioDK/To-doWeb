package com.todoweb.condao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/todo?useTimezone=true&serverTimezone=UTC","root","1234");
		} catch (SQLException e) {
			//jdbc:mysql://localhost:3306/?user=root
			throw new RuntimeException(e);
		}
	}
	
}
