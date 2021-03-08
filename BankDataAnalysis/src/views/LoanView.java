package views;

/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 * Lab 4
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.daoModel;

public class LoanView extends JFrame {
	/**
	 * Generated the serial version ID and made the daoModel() object.
	 */
	private static final long serialVersionUID = 6348018170112990032L;
	daoModel dao = new daoModel();

	/**
	 * Make use of the Constructor of the class and use the swing and awt
	 * components to create the mainframe and the graphical components. MetaData
	 * is used to fetch the data from the getResultset() method from daoModel()
	 * and it is added in to the frame rowwise.
	 */
	public LoanView() {
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		Vector<String> column = new Vector<String>();
		try {
			ResultSet sr = dao.getResultSet();
			ResultSetMetaData metaData = sr.getMetaData();
			int columns = metaData.getColumnCount();

			String cols = "";
			for (int i = 1; i <= columns; i++) {
				cols = metaData.getColumnName(i);
				column.add(cols);
			}

			while (sr.next()) {
				Vector<Object> row = new Vector<Object>(columns);
				for (int i = 1; i <= columns; i++) {
					row.addElement(sr.getObject(i));
				}
				data.addElement(row);
			} // end the while loop
			sr.close();
			DefaultTableModel model = new DefaultTableModel(data, column);

			JTable table = new JTable(model);

			JFrame frame = new JFrame("Loan Related Details");
			frame.setSize(700, 300);
			frame.add(new JScrollPane(table));
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of block
}
