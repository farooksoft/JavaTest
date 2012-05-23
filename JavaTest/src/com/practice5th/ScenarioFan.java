package com.practice5th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScenarioFan {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Fan polar=new Fan();
	while(true)
	{
		System.out.println("press enter to pull the chain");
		br.readLine();
		polar.pull();
	}
}
}
