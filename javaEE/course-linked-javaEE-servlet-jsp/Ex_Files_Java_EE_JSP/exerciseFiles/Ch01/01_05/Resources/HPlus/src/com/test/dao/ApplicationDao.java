package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.test.beans.Order;
import com.test.beans.Product;
import com.test.beans.User;
import com.test.util.DateUtils;

public class ApplicationDao {

	public List<Product> searchProducts(String searchString) throws SQLException {
		List<Product> products = new ArrayList<Product>();
		Connection connection = DBConnection.getConnectionToDatabase();
		System.out.println("search string in DAO: " + searchString);

		PreparedStatement statement = connection
				.prepareStatement("select * from products where product_name like '%" + searchString + "%'");
		ResultSet set = statement.executeQuery();
		Product product = null;
		while (set.next()) {
			product = new Product();
			product.setProductId(set.getInt("product_id"));
			product.setProductName(set.getString("product_name"));
			product.setProductImgPath(set.getString("image_path"));
			products.add(product);
		}
		return products;
	}

	public int registerUser(User user) throws SQLException {
		Connection connection = DBConnection.getConnectionToDatabase();
		String insertUserQuery = "insert into users values(?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(insertUserQuery);
		statement.setString(1, user.getUsername());
		statement.setString(2, user.getPassword());
		statement.setString(3, user.getFirstName());
		statement.setString(4, user.getLastName());
		statement.setInt(5, user.getAge());
		statement.setString(6, user.getActivity());
		System.out.println(insertUserQuery);

		int rowsAffected = statement.executeUpdate();
		return rowsAffected;
	}

	public boolean validateUser(String username, String password) {
		Connection connection = DBConnection.getConnectionToDatabase();

		String sqlQuery = "select * from users where username=? and password=?";
		PreparedStatement statement;
		boolean isValidUser = false;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				isValidUser = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isValidUser;

	}

	public List<Order> getOrdersForUser(String username) {
		List<Order> orders = new ArrayList<>();

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			System.out.println("search string in DAO: " + username);
			Order order = null;
			PreparedStatement statement = connection.prepareStatement("select * from orders where user_name=?");
			statement.setString(1, username);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				order = new Order();
				order.setOrderId(set.getInt("order_id"));
				order.setProductName(set.getString("product_name"));
				order.setProductImgPath(set.getString("image_path"));
				order.setOrderDate(DateUtils.formatDate(new Date(set.getDate("order_date").getTime())));
				order.setUsername(set.getString("user_name"));
				orders.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orders;

	}

	
	public User getProfileDetails(String username){
		User user = new User();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			System.out.println("search string in DAO: " + username);
			PreparedStatement statement = connection.prepareStatement("select * from users where username=?");
			statement.setString(1, username);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				
				user.setUsername(set.getString("username"));
				user.setFirstName(set.getString("first_name"));
				user.setLastName(set.getString("last_name"));
				user.setActivity(set.getString("activity"));
				user.setAge(set.getInt("age"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
}
