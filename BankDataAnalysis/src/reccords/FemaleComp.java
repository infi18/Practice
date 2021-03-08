package reccords;
import java.util.Comparator;
/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
public class FemaleComp implements Comparator<BankReccords> {
	/**
	 *The comparator sorts according Region, Gender, Mortgage
	 */
	@Override
	public int compare(BankReccords b1, BankReccords b2) {

		int res1 = b1.getRegion().compareTo(b2.getRegion()) ;
		if (res1 != 0) {
			return res1;
		}
		int res2 = b1.getSex().compareTo(b2.getSex());
		if (res2 != 0) {
			return res2;
		}
		int res3 = b1.getMortgage().compareTo(b2.getMortgage());
		if (res3 != 0) {
			return res3;
		}
		return b1.getSav_acc().compareTo(b2.getSav_acc());

	}

}

