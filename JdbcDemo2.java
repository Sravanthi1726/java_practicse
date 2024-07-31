package com.sravanthi.jdbc;
import java.sql.*;
public class JdbcDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");	
		//create a new table under the JdbcCrud database
		
		String sql_query = "create table emp_info(eno int , ename varchar(10) , salary int , eaddr varchar(10));";
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","root");
		
		Statement st = con.createStatement();
		// to create a table with columns
		st.executeUpdate(sql_query);
		// to my refernace
		System.out.println("Table created successfully");
		con.close();

	}

}
