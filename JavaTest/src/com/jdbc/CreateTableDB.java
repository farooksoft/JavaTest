package com.jdbc;

/* Eg., 13			 thin Driver 		*/
import java.sql.*;

public class CreateTableDB {
	Connection con;
	Statement st;

	public CreateTableDB() {
		try {
			//DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
			st = con.createStatement();
			st.execute("create table t30(no number(2))");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String st[]) {
		new CreateTableDB();
	}
}
