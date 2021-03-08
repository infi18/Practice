package reccords;

import java.io.FileWriter; 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */


public class Records extends BankReccords {
	/**
	 * FileWriter function is used to write into file 
	 * making use of constructor for accessing and writing into file
	 * 
	 */
	private static FileWriter wr = null;

	public Records() {
		//The try-catch block below catches and throws exception 
		try {
			wr = new FileWriter("src/bankRec.txt");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * The main method below calls the the avgComp(), maxminComp(), FComp(), MComp()
	 * 
	 * @param args
	 *            
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Records re = new Records();
		re.readData();
		avgComp();
		maxminComp();
		FComp();
		MComp();
String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		try {
wr.write(String.format("%n%nCurrent Date=" + timeStamp + "%nProgrammed by Siddhi Naik%n"));
			wr.close();
		} catch (IOException e) {
			e.getMessage();
		}

System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Siddhi Naik\n");

	}



	/**
	 * This is used to calculate the average income in all the four different
	 * regions making use of avgComp() java comparator class
	 */
	public static void avgComp() {
		double sumIC = 0, resltIC = 0, sumRL = 0, resltRL = 0, sumSB = 0, resltSB = 0, resltTN = 0, sumTN = 0;
		int countIC = 0, countRL = 0, countSB = 0, countTN = 0;
		Arrays.sort(rec, new avgComp());
		for (int i = 0; i < rec.length; i++) {
			if (rec[i].getRegion().equalsIgnoreCase("INNER_CITY")) {
				sumIC += rec[i].getIncome();
				countIC++;
			}
			if (rec[i].getRegion().equalsIgnoreCase("RURAL")) {
				sumRL += rec[i].getIncome();
				countRL++;
			}

			if (rec[i].getRegion().equalsIgnoreCase("SUBURBAN")) {
				sumSB += rec[i].getIncome();
				countSB++;
			}
			if (rec[i].getRegion().equalsIgnoreCase("TOWN")) {
				sumTN += rec[i].getIncome();
				countTN++;
			}
		}
		resltIC = sumIC / countIC;
		resltRL = sumRL / countRL;
		resltSB = sumSB / countSB;
		resltTN = sumTN / countTN;
		System.out.println("The Data Analysis result for Average Income According to Regions is:");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(
				String.format("InnerCity Avg. Income : $%6.2f%nRural Avg. Income : $%6.2f%nSuburban Avg. Income : "+ "$%6.2f%nTown Avg. Income : $%6.2f%n%n ",	resltIC, resltRL, resltSB, resltTN));
		try {
			wr.write("The Data Analysis result for Average Income According to Regions is:");
			wr.write("\n--------------------------------------------------------------------");
			wr.write(String.format("\nInnerCity Avg. Income : $%6.2f%nRural Avg. Income : $%6.2f%nSuburban Avg. Income : "+ "$%6.2f%nTown Avg. Income : $%6.2f%n%n", resltIC, resltRL, resltSB, resltTN));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/** The maxminComp() method analysis data 
	 * gives output for maximum and minimum Income according to region
	 * The method makes use of avgComp() Comparator Class
	 */
	public static void maxminComp() {

		Arrays.sort(rec, new avgComp());
		double maxIC = 0, maxRL = 0, maxSB = 0, maxTN = 0;
		for (int i = 0; i < rec.length; i++) {
if (rec[i].getRegion().equalsIgnoreCase("INNER_CITY") && rec[i].getIncome() > maxIC) {
				maxIC = rec[i].getIncome();
			}
	if (rec[i].getRegion().equalsIgnoreCase("RURAL") && rec[i].getIncome() > maxRL) {
				maxRL = rec[i].getIncome();
			}

if (rec[i].getRegion().equalsIgnoreCase("SUBURBAN") && rec[i].getIncome() > maxSB) {
				maxSB = rec[i].getIncome();
			}
	if (rec[i].getRegion().equalsIgnoreCase("TOWN") && rec[i].getIncome() > maxTN) {
				maxTN = rec[i].getIncome();
			}
		}

double minIC = maxIC, minRL = maxRL, minSB = maxSB, minTN = maxTN;
		for (int i = 0; i < rec.length; i++) {
if (rec[i].getRegion().equalsIgnoreCase("INNER_CITY") && rec[i].getIncome() < minIC) {
				minIC = rec[i].getIncome();
			}
	if (rec[i].getRegion().equalsIgnoreCase("RURAL") && rec[i].getIncome() < minRL) {
				minRL = rec[i].getIncome();
			}

if (rec[i].getRegion().equalsIgnoreCase("SUBURBAN") && rec[i].getIncome() < minSB) {
				minSB = rec[i].getIncome();
			}
	if (rec[i].getRegion().equalsIgnoreCase("TOWN") && rec[i].getIncome() < minTN) {
				minTN = rec[i].getIncome();
			}
		}
		System.out.println("The Data Analysis result for Maximum and Minimum Income According to Regions is:");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(String.format("InnerCity Max Income : $%6.2f%nRural Max Income : $%6.2f%nSuburban Max Income : $%6.2f%nTown Max Income : $%6.2f%n%n "+ "InnerCity Min Income : $%6.2f%nRural Min Income : $%6.2f%nSubarban Min Income : $%6.2f%nTown Min Income : $%6.2f%n%n", maxIC, maxRL, maxSB, maxTN, minIC, minRL, minSB, minTN));
		try {
			wr.write("The Data Analysis result for Maximum and Minimum Income According to Regions is:");
			wr.write("\n--------------------------------------------------------------------------------");
			wr.write(String.format("\nInnerCity Max Income : $%6.2f%nRural Max Income : $%6.2f%nSuburban Max Income : $%6.2f%nTown Max Income : $%6.2f%n%n" + "InnerCity Min Income : $%6.2f%nRural Min Income : $%6.2f%nSuburban region min income : $%6.2f%nTown Min Income : $%6.2f%n%n", maxIC, maxRL, maxSB, maxTN, minIC, minRL, minSB, minTN));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** The FComp() method analysis data 
	 * gives output for Females with Mortgage & Savings account according to region
	 * The method makes use of FComp() Class
	 */
	public static void FComp() {
		Arrays.sort(rec, new FemaleComp());
		int ICcount = 0;
		int RLcount = 0;
		int SBcount = 0;
		int TNcount = 0;
		for (int i = 0; i < rec.length; i++) {
if (rec[i].getSex().equalsIgnoreCase("FEMALE") && rec[i].getMortgage().equalsIgnoreCase("YES") && rec[i].getSav_acc().equalsIgnoreCase("YES")&& rec[i].getRegion().equalsIgnoreCase("INNER_CITY")) {
				ICcount++;
} 
else if (rec[i].getSex().equalsIgnoreCase("FEMALE") && rec[i].getMortgage().equalsIgnoreCase("YES") && rec[i].getSav_acc().equalsIgnoreCase("YES")&& rec[i].getRegion().equalsIgnoreCase("RURAL")) {
		RLcount++;
} 
else if (rec[i].getSex().equalsIgnoreCase("FEMALE") && rec[i].getMortgage().equalsIgnoreCase("YES") && rec[i].getSav_acc().equalsIgnoreCase("YES") && rec[i].getRegion().equalsIgnoreCase("SUBURBAN")) {
		SBcount++;
} 
else if (rec[i].getSex().equalsIgnoreCase("FEMALE") && rec[i].getMortgage().equalsIgnoreCase("YES") && rec[i].getSav_acc().equalsIgnoreCase("YES")&& rec[i].getRegion().equalsIgnoreCase("TOWN")) {
				TNcount++;
			}

		}
		System.out.println("The Data Analysis result for Females with Mortgage & Savings Account According to Regions is:");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(String.format("InnerCity Females with Mortgage & Savings Account:%3s%nRural Females with Mortgage & Savings Account:%3s%n" + "Suburban Females with Mortgage & Savings Account:%3s%nTown Females with Mortgage & Savings Account:%3s%n%n", ICcount, RLcount, SBcount, TNcount));
		try {
			wr.write("The Data Analysis result for Females with Mortgage & Savings Account According to Regions is:");
			wr.write("\n---------------------------------------------------------------------------------------------");
			wr.write(String.format("\nInnerCity Females with Mortgage & Savings Account:%3s%nRural Females with Mortgage & Savings Account:%3s%n" + "Suburban Females with Mortgage & Savings Account:%3s%nTown Females with Mortgage & Savings Account:%3s%n%n", ICcount, RLcount, SBcount, TNcount));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** The MComp() method analysis data 
	 * gives output for Males with car & 1 Child according to region
	 * The method makes use of LocComp() Class
	 */
	public static void MComp() {
		Arrays.sort(rec, new LocComp());
	int cntIC = 0, cntRL = 0, cntSB = 0, cntTN = 0;
	for (int i = 0; i < rec.length; i++) {
if (rec[i].getRegion().equalsIgnoreCase("INNER_CITY") && rec[i].getCar().equals("YES") && rec[i].getChildren() == 1 && rec[i].getSex().equalsIgnoreCase("MALE")) {
		cntIC++;
} else if (rec[i].getRegion().equalsIgnoreCase("RURAL") && rec[i].getCar().equals("YES") && rec[i].getChildren() == 1 && rec[i].getSex().equalsIgnoreCase("MALE")) {
		cntRL++;
} else if (rec[i].getRegion().equalsIgnoreCase("SUBURBAN") && rec[i].getCar().equals("YES") && rec[i].getChildren() == 1 && rec[i].getSex().equalsIgnoreCase("MALE")) {
		cntSB++;
} else if (rec[i].getRegion().equalsIgnoreCase("TOWN") && rec[i].getCar().equals("YES") && rec[i].getChildren() == 1 && rec[i].getSex().equalsIgnoreCase("MALE")) {
		cntTN++;
			}
		}
		System.out.println("The Data Analysis result for Males with Car & 1 Child According to Regions is:");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(String.format("InnerCity Males with car & 1 child :%3s%nRural Males with car & 1 child :%3s%n" + "Suburban Males with car & 1 child :%3s%nTown Males with car & 1 child :%3s%n%n",cntIC, cntRL, cntSB, cntTN));
		try {
			wr.write("The Data Analysis result for Males with Car & 1 Child According to Regions is:");
			wr.write("\n--------------------------------------------------------------------");
			wr.write(String.format("\nInnerCity Males with car and 1 child :%3s%nRural Males with car & 1 child :%3s%n" + "Suburban Males with car & 1 child :%3s%nTown Males with car & 1 child :%3s%n%n",cntIC, cntRL, cntSB, cntTN));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}







