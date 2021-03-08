package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import reccords.BankReccords;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
	public class daoModel extends BankReccords{
	/**
	 * Make use of the Connector class and use it to connect to the
	 * database.Then Create table making use of the Statement and sql.
	 */
	Connector connect = new Connector();
	private Statement statement = null;

	public void createTable() throws Exception {
		try {
			statement = connect.getConnection().createStatement();
			String sq = null;
			sq = "CREATE TABLE S_naik_tab" + "(pid INTEGER not NULL AUTO_INCREMENT," + "id VARCHAR(7),"
					+ "income NUMERIC(8,2)," + "pep VARCHAR(3)," + "PRIMARY KEY(pid))";
			statement.executeUpdate(sq);
			System.out.println("Created the table in the given database...");
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}// end of the block

	/**
	 * 
	 * @param obj
	 *            use this to insert the records into the table created.
	 * @throws Exception
	 *             will throw an sql exception if there is an sql error.
	 */
	public void inserts(BankReccords[] obj) throws Exception {
		try {
			statement = connect.getConnection().createStatement();
			String sq = null;
			for (int i = 0; i < obj.length; ++i) {
				sq = "INSERT INTO S_naik_tab(id,income,pep) " + "VALUES('" + obj[i].getId() + "','" + obj[i].getIncome()
						+ "','" + obj[i].getPep() + "')";
				statement.executeUpdate(sq);
			}
			System.out.println("Inserted records into the table...");
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}// end of the block

	/**
	 * This method is used to get the desired output from the database.
	 * 
	 * @return this will return the result set that is obtained.
	 * @throws Exception
	 *             will throw an exception if there is an error in the query.
	 */
	public ResultSet getResultSet() throws Exception {
		ResultSet sr = null;
		try {
			statement = connect.getConnection().createStatement();
			String sq = "select id,income,pep from S_naik_tab order by pep desc";
			sr = statement.executeQuery(sq);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return sr;
	}// end of the block

}
