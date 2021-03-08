package reccords;
/*
 * Programmer: Siddhi Naik
 * Date: 11/3/2019
 * File Name: BankReccords.java
 *
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import views.LoanView;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Login {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	/**
	 * Make use of the Constructor to fire the methods.
	 */
	public Login() {
		prepGUI();
		mainvaluemet();
	}

	/**
	 * This method is used to prepare the GUI frame for the Login page.Controls
	 * are added to the mainframe.
	 */
	private void prepGUI() {
		mainFrame = new JFrame("Login Page");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent wE) {
				System.exit(0);
			}
		});

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	/**
	 * This method is used to authenticate the user against the given username
	 * and password and then perform the LoanView() instance.
	 */
	private void mainvaluemet() {
		headerLabel.setText("Sign In");

		JLabel namelabel = new JLabel("User ID:", JLabel.RIGHT);
		JLabel passwordLa = new JLabel("Password:", JLabel.CENTER);
		final JTextField userval = new JTextField(6);
		final JPasswordField passwordval = new JPasswordField(6);

		JButton loginButton = new JButton("Login");

		loginButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (userval.getText().equalsIgnoreCase("Snaik") && passwordval.getText().equals("lab4")) {
					mainFrame.dispose();

					new LoanView();
				} else {
					String message = "Username and/or Password Incorrect";
					JOptionPane.showMessageDialog(null, message);
				}
			}

		});
		/*
		 * loginButton.addKeyListener(new KeyListener() {
		 * 
		 * @Override public void keyTyped(KeyEvent arg0) { // TODO
		 * Auto-generated method stub }
		 * 
		 * @Override public void keyReleased(KeyEvent arg0) { // TODO
		 * Auto-generated method stub }
		 * 
		 * @Override public void keyPressed(KeyEvent arg0) { if (i) { // TODO Do
		 * here your event handling isButtonClicked = false; } } }
		 * 
		 * @Override public void keyReleased(KeyEvent e) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void keyTyped(KeyEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * } });
		 */

		controlPanel.add(namelabel);
		controlPanel.add(userval);
		controlPanel.add(passwordLa);
		controlPanel.add(passwordval);
		controlPanel.add(loginButton);
		controlPanel.validate();
	}

}
