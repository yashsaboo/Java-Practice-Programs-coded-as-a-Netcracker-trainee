package com.netcracker;

import java.sql.Connection;
import java.sql.*;

public class ProductService {

	public static void addProduct(int id, String name, double price, int qty) {
		String query = "INSERT INTO products VALUES(?,?,?,?)";
		try (Connection con = DBUtil.getInstance().getConnection()) {
			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setDouble(3, price);
			pst.setInt(4, qty);

			int count = pst.executeUpdate();

			System.out.println(count + " product added...");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		addProduct(101, "Marker", 25, 5);
		addProduct(102, "Laptop", 250000, 10);
		addProduct(103, "Mouse", 400, 35);
	}

}
