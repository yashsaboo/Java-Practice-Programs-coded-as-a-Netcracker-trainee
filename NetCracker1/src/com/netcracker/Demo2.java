package com.netcracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2{

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "hr";
		String password = "hr";
		String query = "SELECT * FROM departments";;

		try(Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery(query);) {
			rs.last();
			int count = rs.getRow();
			System.out.println("Number of rows: "+count);
		} catch (SQLException e) {

			e.printStackTrace();
			e.getErrorCode();
			e.getSQLState();
		}

	}

}

/*
SQL> conn
Enter user-name: system
Enter password: system
Connected.
SQL> alter user hr
  2  identified by hr
  3  account unlock;

User altered.
SQL> conn
Enter user-name: hr
Enter password: hr
Connected.
*/