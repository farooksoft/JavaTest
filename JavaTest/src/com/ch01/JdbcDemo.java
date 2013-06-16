package com.ch01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String args[]) {
		
		String data;
		String username = "root";
		String password = "root";
		String dbUrl = "jdbc:mysql://localhost:3306/hibernate_practice";
		String query = "SHOW TABLES";
		Connection con = null;
		Statement stmt = null;
		CallableStatement cbStmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			
			cbStmt = con.prepareCall("{call getartistname(?,?)}");
			
			cbStmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			cbStmt.setDouble(1, 50);
			cbStmt.execute();
			
			String result = cbStmt.getString(2);
			System.out.println("Result :"+result);
			
			//rs = cbStmt.executeQuery();
			//stmt = con.createStatement();
			//rs = stmt.executeQuery(query);

/*			while (rs.next()) {
				data = rs.getString(2);
				System.out.println(data);
			}*/
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
//				rs.close();
//				stmt.close();
				cbStmt.close();
				con.close();
			} catch (SQLException e) {	}
		}
	}
}