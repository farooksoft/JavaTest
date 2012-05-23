package com.test.casestudyshoaib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class DBCon {
	private static DBCon dbcon;
	private Connection	con;
	private ResultSet rs;
	private Statement stmt;
	
	private DBCon() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost/testdb","user1","oracle");
			
		}catch(Exception e){e.printStackTrace();}
	}
	public static DBCon getDBCon()
	{
		if(dbcon==null)
		{
			dbcon=new DBCon();
			return dbcon;
		}
		else
		{
			return dbcon;
		}
	}
	public HashMap getQuestionSet()
	{
		HashMap<Integer, Question> hm=new HashMap<Integer, Question>();
		Question question=null;
		try{
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from questionaire");
			while(rs.next())
			{
				question=new Question();
				question.setQid(rs.getInt(1));
				question.setQuestion(rs.getString(2));
				question.setO1(rs.getString(3));
				question.setO2(rs.getString(4));
				question.setO3(rs.getString(5));
				question.setAns(rs.getString(6));
				hm.put(question.getQid(),question);
			}
			return hm;
		}catch(Exception e){
			e.printStackTrace();return null;}
		finally{try{stmt.close();rs.close();}catch
			(Exception ee){}}
	}
	
}
