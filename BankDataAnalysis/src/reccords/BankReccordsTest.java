package reccords;
/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*This is the BankReccordsTest.java file
 * The main method has been defined here
 * The functions are called here 
 */

public class BankReccordsTest {

	public static void main(String[] args) {
		BankReccords rt = new BankReccords();  //object initialization
		
		rt.readData();		//Calling the read Function
		
		//Date and time function
		String date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()); 
		
		//Displays date, time and name of coder
		System.out.println("\n\nCur dt=" + date + "\nProgrammed by Siddhi Naik\n");

	}

}
//End of BankReccords.java Class		

