package reccords;
import java.util.Comparator;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
public class avgComp implements Comparator<BankReccords> {
	/**
	 * The Comparator function sorts by Region, Income
	 */
	@Override
	public int compare(BankReccords o1, BankReccords o2) {

		int res = o1.getRegion().compareTo(o2.getRegion());
		if (res != 0) {
			return res;
		}
		return Double.compare(o1.getIncome(), o2.getIncome());
	}

}

