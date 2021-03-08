/**
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
package reccords;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;


/* This is the BankReccords.java file which extends Client.java
 * All the functions for displaying contents of the csv files have been defined here
 * These functions are called by the main method
 * */

public class BankReccords extends Client{
	
//All the necessary variables and array lists have been defined below
//Initialization of variables
 protected static BankReccords rec[];
 static List<List<String>> ar = new ArrayList<>();
 private String id;
 private int age;
 private String sex;
 private String region;
 private double income;
 private String married;
 private int children;
 private String car;
 private String sav_acc;
 private String curr_acc;
 private String mortgage;
 private String pep;
 
 
//The getters and setters
	/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the sex
 */
public String getSex() {
	return sex;
}
/**
 * @param sex the sex to set
 */
public void setSex(String sex) {
	this.sex = sex;
}
/**
 * @return the region
 */
public String getRegion() {
	return region;
}
/**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}
/**
 * @return the income
 */
public double getIncome() {
	return income;
}
/**
 * @param income the income to set
 */
public void setIncome(double income) {
	this.income = income;
}
/**
 * @return the married
 */
public String getMarried() {
	return married;
}
/**
 * @param married the married to set
 */
public void setMarried(String married) {
	this.married = married;
}
/**
 * @return the children
 */
public int getChildren() {
	return children;
}
/**
 * @param children the children to set
 */
public void setChildren(int children) {
	this.children = children;
}
/**
 * @return the car
 */
public String getCar() {
	return car;
}
/**
 * @param car the car to set
 */
public void setCar(String car) {
	this.car = car;
}
/**
 * @return the sav_acc
 */
public String getSav_acc() {
	return sav_acc;
}
/**
 * @param sav_acc the sav_acc to set
 */
public void setSav_acc(String sav_acc) {
	this.sav_acc = sav_acc;
}
/**
 * @return the curr_acc
 */
public String getCurr_acc() {
	return curr_acc;
}
/**
 * @param curr_acc the curr_acc to set
 */
public void setCurr_acc(String curr_acc) {
	this.curr_acc = curr_acc;
}
/**
 * @return the mortgage
 */
public String getMortgage() {
	return mortgage;
}
/**
 * @param mortgage the mortgage to set
 */
public void setMortgage(String mortgage) {
	this.mortgage = mortgage;
}
/**
 * @return the pep
 */
public String getPep() {
	return pep;
}
/**
 * @param pep the pep to set
 */
public void setPep(String pep) {
	this.pep = pep;
}


/*The readData function is defined here 
 * readData makes use of BufferedReader and FileReader to read the .csv file
 * If the file is found it will print the print Statement and call processData function
 * else will throw an error
 * the BufferedReader is in the try-catch block
 * this is for handling any errors that may occur
 * 
 * */
public void readData() {
		String str = " ";
		 
		//
		try(BufferedReader br = new BufferedReader(new FileReader("src/bank-Detail.csv")))  //error handling
		{
			
			while((str = br.readLine())!= null) 
			{
			ar.add(Arrays.asList(str.split(",")));
			}
	}	
		catch(FileNotFoundException e) //catch block if file is not found
	{
		System.out.println("File Not Found !! Try Again !!");
	}	
		catch(IOException ex) //catch block if IO exception occurs
		{   
		System.out.println("Input Output Exception !! Try Again");
		}

		System.out.println("\t\t\t\t\t\tHELLO\t\t\t\t\t\t");
			rec = new BankReccords[ar.size()];
			
			processData();     //calls the process function
	}
		
/*
 * The procesData function has been defined below
 * The processData function  takes data from the array list 
 * It then parses data and passes it to all the fields of rec
 * For this it makes use of enhanced loop
 * Then it calls the printData function 
 * */	
	public void processData() {
		
		//initialization of enhanced loop
		int x = 0;
		for (List<String> rowData : ar) {
			rec[x] = new BankReccords();
			rec[x].setId(rowData.get(0));
			rec[x].setAge(Integer.parseInt(rowData.get(1)));
			rec[x].setSex(rowData.get(2));
			rec[x].setRegion(rowData.get(3));
			rec[x].setIncome(Double.parseDouble(rowData.get(4)));
			rec[x].setMarried(rowData.get(5));
			rec[x].setChildren(Integer.parseInt(rowData.get(6)));
			rec[x].setCar(rowData.get(7));
			rec[x].setSav_acc(rowData.get(8));
			rec[x].setCurr_acc(rowData.get(9));
			rec[x].setMortgage(rowData.get(10));
			rec[x].setPep(rowData.get(11));
			x++ ;
		}
		
		  double secs = 1000000000.0;
	        PersistentObject pe = new PersistentObject();
	        long startTime = System.nanoTime();
	        try {
	            FileOutputStream fileOut = new FileOutputStream("bankrecords.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(pe);

	            out.close();
	            fileOut.close();
	            System.out.println("Serialized data is saved in bankrecords.ser");
	        } catch (IOException i) {
	            i.printStackTrace();
	        }

	        long endTime = System.nanoTime();
	        PersistentObject pq = null;

	        try {
	            FileInputStream fileIn = new FileInputStream("bankrecords.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            pq = (PersistentObject) in.readObject();
	            in.close();
	            fileIn.close();
	        } catch (IOException i) {
	            i.printStackTrace();
	            return;
	        } catch (ClassNotFoundException c) {
	            System.out.println("Employee class not found");
	            c.printStackTrace();
	            return;
	        }
	        long endTime1 = System.nanoTime();
	        System.out.println("\nThe Data Object is retrieved from the file and the value is \n" + pq.util);
	        HashMap<Integer, BankReccords[]> newBankRecords = new HashMap<Integer, BankReccords[]>();
	        newBankRecords = pq.bankRecords;
	        if (newBankRecords != null) {
	            System.out.println("\nThe map object is retrieved from the file  and stored in newBankRecords");
	        }

	        long duration = endTime - startTime;
	        long duration1 = endTime1 - endTime;
	        long duration2 = duration1 - duration;
	        System.out.println("\nTime for Serialization:- " + (duration / secs) + "secs" + "\nTime for Deserialization:- "
	                + (duration1 / secs) + "secs" + "\nTime Difference between Serialization and Deserialization:- "
	                + (duration2 / secs) + "secs\n");
	    }

			//System.out.println("\t\t\t\t\tTHERE ARE TOTAL 600 RECORDS\t\t\t");
			//System.out.println("\t\t\t\t\tTHE FIRST 25 RECCORDS ARE AS BELOW:\t\t\t");
			
			//printData(); //calls print function
		
	
	
	/* The print function initialized below displays the final output
	 * It displays exactly the first 25  records out of the total 600 present 
	 * A for loop is initialized for the same
	 */
	public void printData() {
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("ID\t\tAge\t\tSex\tRegion\t\tIncome\t\tMarried\t\tChildren\tCar\t\tSav\t\tCurr\t\tMort\t\tPep");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//for loop is initialized for printing the required 25 records
		for (int i = 0; i < 25; i++) {
			
			String s = String.format("%s\t\t%s\t\t%s\t%-10s\t$%9.2f\t%-10s\t%s\t\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s",rec[i].getId(), rec[i].getAge(),rec[i].getSex(), rec[i].getRegion(), rec[i].getIncome(), rec[i].getMarried(),rec[i].getChildren(), rec[i].getCar(), rec[i].getSav_acc(), rec[i].getCurr_acc(), rec[i].getMortgage(), rec[i].getPep());
			System.out.println(s);
			}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
}

//End of BankReccord.java Class


