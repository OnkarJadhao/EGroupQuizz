package com.QuestionOptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ScoreSixToTen {
	//6
		public static int q6(PreparedStatement pst,Connection con) 
		{			
			int score = 0;
			boolean counter = false;
			
			try {
				String query1 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.java1.0'";
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
						if(QnA_ansCol.getRow()==6) 
						counter  = input1.equals(""+QnA_ansCol.getString(2));
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
		//7
		public static int q7(PreparedStatement pst,Connection con) 
		{
			int score =0;
			boolean counter = false;
			
			try {
				String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.put'";
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
						if(QnA_ansCol.getRow()==7) //row selection
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
		//8
		public static int q8(PreparedStatement pst,Connection con) 
		{
			int score =0;
			boolean counter = false;
				
			try {	
				String query1 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.Stack'";
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
						if(QnA_ansCol.getRow()==8) 
						counter  = input1.equals(""+QnA_ansCol.getString(2));
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
		//9
		public static int q9(PreparedStatement pst,Connection con) 
		{
			int score =0;
			boolean counter = false;
			
			try {
				String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.static'";
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
						if(QnA_ansCol.getRow()==9) //row selection
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
		//10
		public static int q10(PreparedStatement pst,Connection con) 
		{
			int score =0;
			boolean counter = false;
			
			try {
				String query2 = "select Questions,Option_1,Option_2,Option_3,Option_4 from QnO where Option_1='a.3'";
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
						if(QnA_ansCol.getRow()==10) //row selection
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
