package com.netcracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDeptService {

	public static void main(String[] args) {
		try (Connection connection = DBUtil.getInstance().getConnection()) {
			String query = "select first_name,last_name,department_id" + " from employees inner join departments"
					+ " using(department_id)" + " where departments.department_name = ?";
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter department name");
			String input = scanner.nextLine();

			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, input);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
