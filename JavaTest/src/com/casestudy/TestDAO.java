package com.casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TestDAO {

	Connection conn = null;

	public TestDAO() {
		createConnection();
	}

	/***
	 * this method creates a database connection using type4 driver.
	 * 
	 * @throws Exception
	 */
	public void createConnection() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:localhost:1521", "system", "rambabu");

		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
	}

	/**
	 * inserts question and answer into the table
	 * 
	 * @param question
	 * @param answer
	 * @throws Exception
	 */
	public void insertQuestions(String question, String answer, String option1,
			String option2, String option3, String option4) throws Exception {
		PreparedStatement pst = null;
		String query = "insert into r_cnd_test(question,answer,option1,option2,option3,option4) values (?,?,?,?,?,?)";

		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, question);
			pst.setString(2, answer);
			pst.setString(3, option1);
			pst.setString(4, option2);
			pst.setString(5, option3);
			pst.setString(6, option4);
			int update = pst.executeUpdate();
		} catch (Exception e) {
			if (pst != null) {
				pst.close();
			}
			System.out.println(e);
			throw e;
		}
	}

	/**
	 * method return all the question in the database into an arrayList
	 * 
	 * @return
	 * @throws Exception
	 */
	public Object[] getQuestions() throws Exception {
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<String> qList = null;
		ArrayList<String> optionList = null;
		Object[] objects = new Object[2];
		try {
			qList = new ArrayList<String>();
			optionList = new ArrayList<String>();
			pst = conn
					.prepareStatement("select question,option1,option2,option3,option4 from r_cnd_test");
			rs = pst.executeQuery();
			while (rs.next()) {
				String question = rs.getString("question");
				String option1 = rs.getString("option1");
				String option2 = rs.getString("option2");
				String option3 = rs.getString("option3");
				String option4 = rs.getString("option4");
				String tmp = " a." + option1 + "     b." + option2 + "     c."
						+ option3 + "     d." + option4;
				optionList.add(tmp);
				qList.add(question);
			}

			objects[0] = qList;
			objects[1] = optionList;
		} catch (Exception e) {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();

			throw e;
		}
		return objects;
	}

	/**
	 * method return all the question in the database into an arrayList
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean checkAnswer(String question, String answer) throws Exception {
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList qList = null;
		boolean isCorrect = false;
		try {
			qList = new ArrayList();
			pst = conn
					.prepareStatement("select count(*) cnt from r_cnd_test where question=? and answer=?");
			pst.setString(1, question);
			pst.setString(2, answer);
			rs = pst.executeQuery();
			while (rs.next()) {
				int cnt = rs.getInt("cnt");
				if (cnt == 1) {
					isCorrect = true;
				}

			}
		} catch (Exception e) {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();

			throw e;
		}
		return isCorrect;
	}

}
