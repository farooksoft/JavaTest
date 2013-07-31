package Assign1;

/* 16.	A palindrome is a number or text phrase that reads the same backward. Write an applet that reads in a five-digit integer and determines whether or not it is a palindrome. If the number is not of five digits, display an error message dialog indicating the problem to the user. When the user dismisses the error dialog, allow the user to enter a new value. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Palindrome extends JApplet implements ActionListener {

	JButton answer, reset;
	int number, copy_number, reverse, remain;
	JTextField input_no;
	JLabel input;
	JPanel panel;

	public void init() {
		panel = new JPanel();
		add(panel);
		answer = new JButton("Check!");
		input = new JLabel("Enter a five-digit number ");
		input_no = new JTextField(10);
		reset = new JButton("Reset");
		panel.add(input);
		panel.add(input_no);
		panel.add(answer);
		panel.add(reset);
		reset.addActionListener(this);
		answer.addActionListener(this);
	}

	public void checkPalindrome() {
		number = Integer.parseInt(input_no.getText());
		copy_number = number;

		while (number > 0) {
			remain = number % 10;
			reverse = reverse * 10 + remain;
			number = number / 10;
		}
		if (copy_number == reverse)
			JOptionPane.showMessageDialog(this, "this ia a palindrom");
		else
			JOptionPane.showMessageDialog(this, "its not a palindrom");

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == answer)
			checkPalindrome();
		else {
			input_no.setText("");
			input_no.setCursor(null);
			repaint();
		}
	}

}

// <applet code="Palindrome.class" width=200 height=200></applet>

