package Assign1;

/*1.	An integer is said to be a perfect if its factors, including 1 but not the number itself add up to the number. (Ex 6 = 1+2+3). Write an applet with a method in it called Perfect that determines if the parameter number is a perfect number. Use this applet that determines and displays all the perfect numbers between 1 and 1000. Print the factors of each perfect number to confirm the number is indeed perfect. Challenge the computing power of your computes by testing numbers larger than 1000. */

import java.applet.*;
import java.awt.*;

// Color is a class which consists of setColor method
import java.awt.Color.*;

public class PerfectInt extends Applet {
	String str = null;
	int number1, number2;

	int i, sum = 0;

	public boolean Perfect() {
		str = getParameter("num");
		number1 = Integer.parseInt(str);
		number2 = number1;

		for (i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				sum = sum + i;
			}
		}

		if (number2 == sum)
			return true;
		else
			return false;
	}

	public void paint(Graphics g) {
		Font f = new Font("Times New Roman", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.red);
		if (Perfect() == true)
			g.drawString(number2 + " is a Perfect integer", 60, 100);
		else
			g.drawString(number2 + " is Not a Perfect integer", 60, 100);
	}
}
/*
 * <applet code="PerfectInt.class" width=900 height=800> <param name="num"
 * value="10"> </applet>
 */

