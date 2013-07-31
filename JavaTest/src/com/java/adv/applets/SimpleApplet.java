package com.java.adv.applets;

import java.applet.Applet;
import java.awt.Graphics;
//<applet code="SimpleApplet" width=200 height=60>
//</applet>

public class SimpleApplet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8886204470929252327L;

	public void paint(Graphics g) {
		g.drawString("A Simple Applet", 20, 20);
	}
}