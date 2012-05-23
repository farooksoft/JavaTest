package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcConnectionDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/testdb","user1","oracle");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from ex_empdata");
		
		ResultSetMetaData metaData = resultSet.getMetaData();
		int coloumn = metaData.getColumnCount();

		while(resultSet.next()){
			for(int i=1;i<=coloumn;i++){
				System.out.print(metaData.getColumnName(i)+" : "+resultSet.getString(i)+"\t");
			}
			System.out.println("");
		}
	}
}