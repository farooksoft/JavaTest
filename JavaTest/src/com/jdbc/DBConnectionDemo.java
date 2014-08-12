package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DBConnectionDemo {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public DBConnectionDemo() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "user1", "oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int age[] = { 20, 30, 40 };
		DBConnectionDemo ex = new DBConnectionDemo();
		for (int i = 0; i < age.length; i++) {
			ex.display(age[i]);
		}
	}

	public void display(int age) {
		try {
			ps = con.prepareStatement("select *from ex_empdata where age = ?");
			ps.setInt(1, age);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int colcount = rsmd.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= colcount; i++) {
					System.out.print(rsmd.getColumnName(i) + ":"
							+ rs.getString(i) + "\t");
				}
				System.out.println("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}