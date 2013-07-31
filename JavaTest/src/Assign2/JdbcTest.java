package Assign2;

/* Before running this program create a table in Oracle as
 create table student(rollno number(3),name varchar2(15));
*/

import java.sql.*;
import java.io.*;

class JdbcTest
{
 public static void main(String [] args) throws Exception
{
  Connection con=null;
  Statement stat=null;
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
   stat=con.createStatement();
   stat.executeUpdate("insert into student values(101,'Ali')");
   System.out.println("Record inserted......");
  }
  catch(SQLException se)
  {
   System.out.println(se.getMessage());
  }
}
}

   
  
  