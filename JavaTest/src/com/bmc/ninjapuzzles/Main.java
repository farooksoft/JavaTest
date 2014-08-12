package com.bmc.ninjapuzzles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	private static Map<String, Integer> scoreCard = new HashMap<String, Integer>();
	private static Set<String> countrySet = new HashSet<String>();
	private static String inputFile = "input.txt";
	private static String outputFile = "output.txt";

	public static void main(String[] args) {
		Main mainObj = new Main();
		boolean boolMessage = mainObj.readAndPopulateData();
		if (boolMessage) {
			System.out
					.println("Succesfully read the input file and populated values");
		}

		System.out.println("Number of No Century countries : "
				+ (countrySet.size() - scoreCard.size()));

		boolMessage = mainObj.writeOutputDatatoFile();
		if (boolMessage) {
			System.out
					.println("Succesfully written to Output file");
		}
	}

	private boolean writeOutputDatatoFile() {

		boolean result = false;
		File file = new File(System.getProperty("user.dir") + "\\src" + "\\"
				+ outputFile);
		FileWriter writer = null;
		try {
			writer = new FileWriter(outputFile);
			writer.write((countrySet.size() - scoreCard.size()) + "");
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException ignore) {
					// Ignore}
				}
		}

		return result;
	}

	private boolean readAndPopulateData() {
		BufferedReader reader = null;
		boolean isSuccess = false;
		try {
			InputStream inputStream = this.getClass().getClassLoader()
					.getResourceAsStream(inputFile);
			reader = new BufferedReader(new FileReader(new File(inputFile)));

			String line;
			while ((line = reader.readLine()) != null) {
				String[] arr = line.split(":");
				String countryName = arr[0];
				Integer score = Integer.parseInt(arr[1]);
				countrySet.add(countryName);
				populateScoreCard(countryName, score);
				isSuccess = true;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	private void populateScoreCard(String cName, Integer score) {

		Integer existingScore = scoreCard.get(cName);
		if (existingScore != null) {
			if (existingScore > score) {
				scoreCard.put(cName, score);
			}
		} else if (score >= 100) {
			scoreCard.put(cName, score);
		}
	}

}
