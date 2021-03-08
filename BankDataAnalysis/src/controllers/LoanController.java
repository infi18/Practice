package controllers;
/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import models.daoModel;
import reccords.BankReccords;

import reccords.Login;


public class LoanController extends BankReccords {

	/**
	 * 
	 * @param args
	 *            unused the main method used to access the objects of the
	 *            different objects of classes and perform the controlling
	 *            action.
	 */
	public static void main(String[] args) {

		/**
		 * creating the instances of the daoModel() and BankRecords() to use
		 * GUI.Also Hashing and Serialization and Deserialization done here by
		 * calling the readData() method.
		 */
		daoModel dao = new daoModel();
		BankReccords br = new BankReccords();
		br.readData();
		try {
			/**
			 * Table is created in the database and the application is put to
			 * sleep for 5 Seconds.Later the same is directed to the Login Page.
			 */
			dao.createTable();
			dao.inserts(rec);
			System.out.println("The application is put to sleep for 5 Seconds");
			Thread.sleep(5000);
			new Login();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("\n\nCur dt=" + timeStamp + "\nProgrammed by Siddhi Naik\n");

	}

}
