package com.netcracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoWithTryWithResources {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "hr";
		String password = "hr";
		String query = "SELECT * FROM departments";;

		try(Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);) {
			int count = 0;
			while (rs.next()) {
				System.out.println(++count + ":" + rs.getString("department_name"));
			}
			//In try-with-resources, you don't need to close stuffs because try-with-resources does that for you
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