package com.puzzles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SFDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:\\Work\\input3.txt");
		int tilesCountShouldBe = 0;
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			String[] split = scanner.nextLine().split(" ");

			/*
			 * Forest Initialization with size and initial forest will be filled
			 * with all 0's
			 */
			SF sf = new SF(Integer.parseInt(split[0]),
					Integer.parseInt(split[1]));

			/*
			 * Printing the forest
			 */
			sf.showForest();

			tilesCountShouldBe = Integer.parseInt(scanner.nextLine());
			System.out.println("Tiles Count Should Be :" + tilesCountShouldBe);

			/*
			 * Add the tiles to the forest. Added Tiles values will be set to 1
			 */
			int count = 0;
			while (scanner.hasNext()) {
				split = scanner.nextLine().split(" ");
				System.out.println(split[0] + ":" + split[1]);
				sf.add(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
				count++;
			}
			System.out.println(count + " values read from the file");

			/*
			 * Printing the modified Forest
			 */
			sf.showForest();

			int cabinets = sf.getNumberOfCabinets();
			System.out.println("Cabinets : " + cabinets);

			// sf.showForest();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
