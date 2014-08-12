package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcPrepStatementDemo {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public JdbcPrepStatementDemo() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/testdb", "user1",
					"oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int age[] = { 10, 20, 30, 40 };
		JdbcPrepStatementDemo prepStatementDemo = new JdbcPrepStatementDemo();
		for (int i = 0; i < age.length; i++) {
			try {
				prepStatementDemo.displayResult(age[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void displayResult(int i) throws Exception {
		try {
			preparedStatement = connection
					.prepareStatement("select * from ex_empdata where age = ?");
			preparedStatement.setInt(1, i);
			resultSet = preparedStatement.executeQuery();

			ResultSetMetaData metaData = resultSet.getMetaData();
			int coloumn = metaData.getColumnCount();

			while (resultSet.next()) {
				for (int k = 1; k <= coloumn; k++) {
					System.out.print(metaData.getColumnName(k) + " : "
							+ resultSet.getString(k) + "\t");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// finally{
		// resultSet.close();
		// preparedStatement.close();
		// connection.close();
		// }
	}
}
