package com.test.cfwork;

import java.util.StringTokenizer;
class STDemo	{
static String in="title=java: The Complete Reference ;" +
	"By =srinath"	 +
	"In =Bangalore";
	public static void main(String args[])	{
		StringTokenizer st=new StringTokenizer(in,"=;");
		while(st.hasMoreTokens())
		{
			String key=st.nextToken();
			String val=st.nextToken();
			System.out.println(key+"\t"+val);
		}
	}
}