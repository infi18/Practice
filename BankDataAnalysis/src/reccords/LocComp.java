package reccords;
import java.util.Comparator;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
public class LocComp implements Comparator<BankReccords> {

	/**
	 * The comparator below Sorts by Region, Gender, Car
	 */
	@Override
	public int compare(BankReccords o1, BankReccords o2) {

		int res= o1.getRegion().compareTo(o2.getRegion());
		if (res != 0) {
			return res;
		}
		int res2 = o1.getSex().compareTo(o2.getSex());
		if (res2 != 0) {
			return res2;
		}
		return o1.getCar().compareTo(o2.getCar());
	}

}

