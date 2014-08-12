package com.puzzles;

/**
 * 
 * @author srinath.rayabarapu
 */
public class SavePrincessDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SavePrincess program = new SavePrincess();

		program.feedData("C:\\Work\\Bot_saves_princess.txt");

		program.printField();

		program.findPrincess();
	}

}