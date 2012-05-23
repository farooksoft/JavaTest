package com.test.jdbc;

import java.sql.*;

public class Connectdb {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con;
		con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select user from dual");
		while (rs.next()) {
			System.out.println(rs.getString("user"));
		}
	}
}
