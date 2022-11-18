package com.QuestionOptions;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnswerInput1 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		int scoreC =0;
		
		int score;
		boolean counter =false ;
		try {
			con = DB.getConnection();			
			
			Scanner id_sc = new Scanner(System.in);
			System.out.println("Enter id : ");
			int id = id_sc.nextInt();
			
//			Scanner name_sc = new Scanner(System.in);
//			System.out.println("Enter name : ");
//			String name = name_sc.nextLine();
			Map<Integer, List> tm = new TreeMap<>();  
			
			int rowId=0;
				rowId=1;
				System.out.println("Test is running for Onkar.");
				List s1 = ScoreUpdate.ScoreUpdateCall(con,pst,id,rowId);
				System.out.println("List of student 1 : "+s1);
				tm.put(id, s1);
				
				rowId = 2;
				String studId2Col = "select id from studentdata";
				pst = con.prepareStatement(studId2Col);
				ResultSet studId2 = pst.executeQuery();
				
				while(studId2.next())
				{	
					if(studId2.getRow()==2)
					id = studId2.getInt(1);
				}
				System.out.println("Test is running for Akshay.");
				List s2 = ScoreUpdate.ScoreUpdateCall(con,pst,id,rowId);
				System.out.println("List of student 2 : "+s2);	
				tm.put(id, s2);				
				
				rowId =3;	
				String studId3Col = "select id from studentdata";
				pst = con.prepareStatement(studId3Col);
				ResultSet studId3 = pst.executeQuery();
				
				while(studId3.next())
				{	
					if(studId3.getRow()==rowId)
					id = studId3.getInt(1);
				}
				System.out.println("Test is running for Vaishnavi.");
				List s3 = ScoreUpdate.ScoreUpdateCall(con,pst,id,rowId);
				System.out.println("List of student 3 : "+s3);
				tm.put(id, s3);
			 
				rowId =4;
				String studId4Col = "select id from studentdata";
				pst = con.prepareStatement(studId4Col);
				ResultSet studId4 = pst.executeQuery();
				
				while(studId4.next())
				{	
					if(studId4.getRow()==rowId)
					id = studId4.getInt(1);
				}
				
				System.out.println("Test is running for Gaurav.");
				List s4 = ScoreUpdate.ScoreUpdateCall(con,pst,id,rowId);
				System.out.println("List of student 4 : "+s4);
				tm.put(id, s4);
			
				System.out.println(tm);
										
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				con.close();
				pst.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}