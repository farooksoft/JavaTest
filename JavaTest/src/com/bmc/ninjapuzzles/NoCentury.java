package com.bmc.ninjapuzzles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoCentury {

	static String inputFile = "com\\ninja\\puzzles\\input.txt";
	static String outputFile = "com\\ninja\\puzzles\\output.txt";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NoCentury noCenturyObj = new NoCentury();
		List<String> inputFileDataList = noCenturyObj.getInputFileDataList(inputFile);
		
		System.out.println(inputFileDataList.size());
		
		int noCenturyCountries = noCenturyObj.findNoCenturyCountries(inputFileDataList);
		System.out.println(noCenturyCountries);
		
		boolean isSuccesful = noCenturyObj.writeOutputDatatoFile(noCenturyCountries, outputFile);
		System.out.println(isSuccesful);
	}
	
	private boolean writeOutputDatatoFile(int noCenturyCountries, String fileName) {
		boolean result = false;
		File file = new File(System.getProperty("user.dir")+"\\src"+"\\"+fileName);
	    FileWriter writer = null;
	    try {
	        writer = new FileWriter(file);
	        writer.write(noCenturyCountries+"");
	        result = true;
	    } catch (IOException e) {
	        e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
	    } finally {
	        if (writer != null) try { writer.close(); } catch (IOException ignore) {}
	    }
	    
		return result;
	}

	private int findNoCenturyCountries(List<String> inputFileDataList) {
		
		int century = 100;
		Set<String> countriesSet = new HashSet<String>();
		
		for(int i=0;i<inputFileDataList.size();i++){
			String dataLine = inputFileDataList.get(i);
			String[] split = dataLine.split(":");
			
			if(split.length == 2 && Integer.parseInt(split[1].trim()) >= century){
				countriesSet.add(split[0]);
			}
		}
		
		return countriesSet.size();
		
	}

	/**
	 * Reads a file and returns a List with the file data
	 * 
	 * @param inputFile
	 * @return List<Double>
	 */
	private List<String> getInputFileDataList(String inputFile) {

		String token = null;
		List<String> fileDataList = new ArrayList<String>();
		BufferedReader reader = null;

		try {
			System.out.println("input file is:"+inputFile);
			InputStream inputStream = this.getClass().getClassLoader()
					.getResourceAsStream(inputFile);
			
			reader = new BufferedReader(new InputStreamReader(inputStream));

			while ((token = reader.readLine()) != null) {
				fileDataList.add(token);
			}
			
		} catch (IOException e) {
			System.out.println("Something went wrong while reading from Input.txt");
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ignore) {
				// Ignore the exception
			}
		}
		return fileDataList;
	}

}
