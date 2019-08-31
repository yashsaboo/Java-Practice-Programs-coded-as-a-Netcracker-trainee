package com.netcracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection connection;
	
	private static DBUtil instance = new DBUtil();
	
	public static DBUtil getInstance()
	{
		return instance;
	}

	public static Connection getConnection() {
		try {
			if ((connection == null) || connection.isClosed()) {
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String username = "hr";
				String password = "hr";
				connection = DriverManager.getConnection(url, username, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
