package com.QuestionOptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//Question logic of q1 to q5
public class ScoreOneToFive 
{
	//1
	public static int q1(PreparedStatement pst,Connection con) 
	{
		int score = 0;
		boolean counter = false;
		
		try {
			String query1 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.8'";
			pst = con.prepareStatement(query1);
			ResultSet answers1 =pst.executeQuery();
			
			String QnA_ansColumn = "select * from QnA";
			pst = con.prepareStatement(QnA_ansColumn);
			ResultSet QnA_ansCol = pst.executeQuery();
			
			while(answers1.next())
			{
				if(answers1.getRow()==1)
				{
				System.out.println(answers1.getString(1));
				System.out.println(answers1.getString(2));
				System.out.println(answers1.getString(3));
				System.out.println(answers1.getString(4));
				System.out.println(answers1.getString(5));
				}
				Scanner s1 = new Scanner(System.in);			
				String input1 = s1.nextLine();
				
				while(QnA_ansCol.next())		//working for complete table
				{
					if(QnA_ansCol.getRow()==1) 
					counter  = input1.equals(""+QnA_ansCol.getString(2));
				}
					
				if(counter==true)
				{
					score++;			
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return score;
	}

	public static int q2(PreparedStatement pst,Connection con) 
	{
		int score =0;
		boolean counter = false;
		
		try {
			String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.8bytes'";
			pst = con.prepareStatement(query2);
			ResultSet answers2 =pst.executeQuery();
			
			String QnA_ansColumn = "select * from QnA";
			pst = con.prepareStatement(QnA_ansColumn);
			ResultSet QnA_ansCol = pst.executeQuery();
			
			while(answers2.next())
			{
				if(answers2.getRow()==1)		//Dont change options row.
				{
				System.out.println(answers2.getString(1));
				System.out.println(answers2.getString(2));
				System.out.println(answers2.getString(3));
				System.out.println(answers2.getString(4));
				System.out.println(answers2.getString(5));
				}
				Scanner s2 = new Scanner(System.in);			
				String input2 = s2.nextLine();
				
				while(QnA_ansCol.next())		//working for complete table
				{
					if(QnA_ansCol.getRow()==2) //row selection
					counter  = input2.equals(""+QnA_ansCol.getString(2));
				}
					
				if(counter==true)
				{
					score++;		
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return score;
}
	public static int q3(PreparedStatement pst,Connection con) 
	{
		int score =0;
		boolean counter = false;
			
		try {	
			String query1 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.32'";
			pst = con.prepareStatement(query1);
			ResultSet answers1 =pst.executeQuery();
			
			String QnA_ansColumn = "select * from QnA";
			pst = con.prepareStatement(QnA_ansColumn);
			ResultSet QnA_ansCol = pst.executeQuery();
			
			while(answers1.next())
			{
				if(answers1.getRow()==1)
				{
				System.out.println(answers1.getString(1));
				System.out.println(answers1.getString(2));
				System.out.println(answers1.getString(3));
				System.out.println(answers1.getString(4));
				System.out.println(answers1.getString(5));
				}
				Scanner s1 = new Scanner(System.in);			
				String input1 = s1.nextLine();
				
				while(QnA_ansCol.next())		//working for complete table
				{
					if(QnA_ansCol.getRow()==3) 
					counter  = input1.equals(""+QnA_ansCol.getString(2));
				}
					
				if(counter==true)
				{
					score++;			
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return score;
	}

	public static int q4(PreparedStatement pst,Connection con) 
	{
		int score =0;
		boolean counter = false;
		
		try {
			String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.4'";
			pst = con.prepareStatement(query2);
			ResultSet answers2 =pst.executeQuery();
			
			String QnA_ansColumn = "select * from QnA";
			pst = con.prepareStatement(QnA_ansColumn);
			ResultSet QnA_ansCol = pst.executeQuery();
			
			while(answers2.next())
			{
				if(answers2.getRow()==1)		//Dont change options row.
				{
				System.out.println(answers2.getString(1));
				System.out.println(answers2.getString(2));
				System.out.println(answers2.getString(3));
				System.out.println(answers2.getString(4));
				System.out.println(answers2.getString(5));
				}
				Scanner s2 = new Scanner(System.in);			
				String input2 = s2.nextLine();
				
				while(QnA_ansCol.next())		//working for complete table
				{
					if(QnA_ansCol.getRow()==4) //row selection
					counter  = input2.equals(""+QnA_ansCol.getString(2));
				}
					
				if(counter==true)
				{
					score++;			
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return score;
}

	public static int q5(PreparedStatement pst,Connection con) 
	{
		int score =0;
		boolean counter = false;
		
		try {
			String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.java.lang.object'";
			pst = con.prepareStatement(query2);
			ResultSet answers2 =pst.executeQuery();
			
			String QnA_ansColumn = "select * from QnA";
			pst = con.prepareStatement(QnA_ansColumn);
			ResultSet QnA_ansCol = pst.executeQuery();
			
			while(answers2.next())
			{
				if(answers2.getRow()==1)		//Dont change options row.
				{
				System.out.println(answers2.getString(1));
				System.out.println(answers2.getString(2));
				System.out.println(answers2.getString(3));
				System.out.println(answers2.getString(4));
				System.out.println(answers2.getString(5));
				}
				Scanner s2 = new Scanner(System.in);			
				String input2 = s2.nextLine();
				
				while(QnA_ansCol.next())		//working for complete table
				{
					if(QnA_ansCol.getRow()==5) //row selection
					counter  = input2.equals(""+QnA_ansCol.getString(2));
				}
					
				if(counter==true)
				{
					score++;		
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return score;
}
}

