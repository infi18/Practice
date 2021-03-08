package reccords;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
public class PersistentObject extends BankReccords implements Serializable {

	/**
	 * This class implements the serializable interface and the data from the
	 * BankRecords Object is put into the HashMap and
	 * 
	 */
	private static final long serialVersionUID = -8672399734359137584L;
	protected java.util.Date util = new Date();
	protected HashMap<Integer, BankReccords[]> bankRecords = new HashMap<Integer, BankReccords[]>();

	public PersistentObject() {
		HashMap<Integer, BankReccords[]> bankRecords = new HashMap<Integer, BankReccords[]>();
		bankRecords.put(1222, rec);
		System.out.println("Objects of BankRecords stored into the map bankRecords\n\n");

	}

	public void myHashmap() {
		Iterator<Integer> it = bankRecords.keySet().iterator();

		while (it.hasNext()) {
			int keyval = it.next();
			rec = bankRecords.get(keyval);
			System.out.print(keyval + ":");
			for (int i = 0; i < rec.length; i++) {
				System.out.println(rec[i].getId() + " " + rec[i].getIncome() + " " + rec[i].getCurr_acc());
			}
		}

	}

	

}
