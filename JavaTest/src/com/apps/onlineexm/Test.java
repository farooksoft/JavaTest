package com.apps.onlineexm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException, IOException {

		// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con;
		con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:testdb", "user1", "oracle");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from questionaire");
		HashMap<String, Question> qmap = new HashMap<String, Question>();
		HashMap<String, Boolean> amap = new HashMap<String, Boolean>();
		Question qs = null;
		while (rs.next()) {
			qs = new Question();
			qs.setSno(rs.getString(1));
			qs.setQuestion(rs.getString(2));
			qs.setOpt1(rs.getString(3));
			qs.setOpt2(rs.getString(4));
			qs.setOpt3(rs.getString(5));
			qs.setRight(rs.getString(6));
			qmap.put(qs.getSno(), qs);
			amap.put(qs.getSno(), new Boolean(false));

		}
		Set keySet = qmap.keySet();// returns all the keys in the map qmap.
		Iterator itr = keySet.iterator();// set requires an iterator to iterate
											// thru the elements inside a set.
		int count = 0;
		while (itr.hasNext()) {
			qs = qmap.get(itr.next()); // qs = qmap.get("1"),qs = qmap.get("2")
			System.out.println(qs.getQuestion());
			System.out.println(qs.getOpt1());
			System.out.println(qs.getOpt2());
			System.out.println(qs.getOpt3());
			System.out.println("choice ??");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String s = br.readLine();

			if (qs.getRight().equals(s)) {
				amap.put(qs.getSno(), new Boolean(true));
				count++;
			}

		}

		Set aset = amap.entrySet();

		Iterator itr2 = aset.iterator();
		while (itr2.hasNext()) {
			Entry<String, Boolean> e = (Entry<String, Boolean>) itr2.next();
			System.out.print(e.getKey());
			System.out.print(":");
			System.out.println(e.getValue());

		}
		// System.out.println("Result:\t"+count+"marks");
	}
}
