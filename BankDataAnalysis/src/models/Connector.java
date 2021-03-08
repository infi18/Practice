package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
public class Connector {
	static final String DB_URL = "jdbc:mysql://www.papademas.net:3307/510labs?autoReconnect=true&useSSL=false";
	static final String USER = "db510", PASS = "510";
	/**
	 * 
	 * @return this will return the connection object
	 * after making the connection to the database.
	 */
	public Connection getConnection() {
		Connection connect = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(DB_URL,USER,PASS);
//			connect = DriverManager
//					.getConnection("jdbc:mysql://localhost:3306/510labs?" + "user=root&password=password");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connect;
	}

}
