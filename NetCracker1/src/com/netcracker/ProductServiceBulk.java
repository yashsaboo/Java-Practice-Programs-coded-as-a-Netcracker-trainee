package com.netcracker;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

class Product {
	private int id;
	private String name;
	private double price;
	private int qty;

	public Product(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}

public class ProductServiceBulk {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(101, "Marker", 25, 5));
		prodList.add(new Product(102, "Laptop", 250000, 10));
		prodList.add(new Product(103, "Mouse", 400, 35));

		String query = "INSERT INTO products VALUES(?,?,?,?)";
		try (Connection con = DBUtil.getInstance().getConnection()) {

			con.setAutoCommit(false);

			PreparedStatement pst = con.prepareStatement(query);
			for (Product prod : prodList) {

				pst.setInt(1, prod.getId());
				pst.setString(2, prod.getName());
				pst.setDouble(3, prod.getPrice());
				pst.setInt(4, prod.getQty());

				pst.executeUpdate();
			}

			con.commit();
			con.setAutoCommit(true);

		} catch (SQLException e) {
			//con
			e.printStackTrace();
		}
	}

}
