package com.test.casestudyshoaib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test {
	DBCon dbcon;
	HashMap hm;
	HashMap<Integer, String> answerset;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Question question;
	int next;
	
	public Test() {
		 dbcon=DBCon.getDBCon();
		 hm=dbcon.getQuestionSet();
	}
	public void takeTest(int noofquestions,int time)
	{
		Random r=new Random();
		answerset=new HashMap<Integer, String>();
		try{
			for(int i=0;i<noofquestions;i++)
			{
				next=r.nextInt(noofquestions);
				if(next!=0){
				question=(Question)hm.get(next);
				System.out.println(question);
				System.out.println("ANS-Press A or B or C and Enter:");
				String ans=br.readLine();
				answerset.put(question.getQid(),ans);
				}
				else
				{
					i--;
					
				}
				
			}
			calculateResult();
		}catch(Exception e){e.printStackTrace();}
	}
	public void calculateResult()
	{
		int score=0;
		Set set= answerset.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext())
		{
			Map.Entry me=(Map.Entry)iter.next();
			int qid=(Integer)me.getKey();
			String ans=(String)me.getValue();
			String rightans=((Question)hm.get(qid)).getAns();
			if(ans.equalsIgnoreCase(rightans.trim()))
			{
				score++;
			}
		}
		System.out.println("You Scored: "+score);
		
	}
public static void main(String[] args) {
	
	Test obj=new Test();
	obj.takeTest(2,20);
	
}
}
