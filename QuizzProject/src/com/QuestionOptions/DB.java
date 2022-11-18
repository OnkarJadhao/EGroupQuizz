package com.QuestionOptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB 
{
	public static Connection getConnection() 
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	//Step 1
		
			String url = "jdbc:mysql://localhost:3306/quizproject?characterEncoding=utf8";
			con = DriverManager.getConnection(url, "root", "Akshay@1");//Step 2
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}