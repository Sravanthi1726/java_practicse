package com.sravanthi.jdbc;
import java.sql.*;
public class JdbcDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","root");
			//query to create employee table
			String create_query="create table employees(id int primary key auto_increment,first_name varchar(50),last_name varchar(50),age int)";
			Statement st=con.createStatement();
			//executing query
			st.executeUpdate(create_query);
			System.out.println("employee table created successfully");
			con.close();
          
	}

}
