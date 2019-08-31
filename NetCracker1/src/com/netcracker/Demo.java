package com.netcracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "hr";
		String password = "hr";
		String query;

		try {
			//1 getting connection
			Connection conn = DriverManager.getConnection(url, username, password);
			query = "SELECT * FROM departments";
			// 2 form statement
			Statement st = conn.createStatement();
			// 3 fire statement
			ResultSet rs = st.executeQuery(query);
			// 4 process result
			int count = 0;
			while (rs.next()) {
				System.out.println(++count + ":" + rs.getString("department_name"));
			}
			//5 Close resources
			rs.close();
			st.close();
			conn.close();
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