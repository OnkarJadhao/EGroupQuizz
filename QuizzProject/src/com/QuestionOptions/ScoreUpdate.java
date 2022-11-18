package com.QuestionOptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

//Adds score of Questions
public class ScoreUpdate {
	
	public static List ScoreUpdateCall(Connection con,PreparedStatement pst,int id,int rowId)
	{
		List sResult = new LinkedList<>();
		try {
			DB.getConnection();		
		int score1 = ScoreOneToFive.q1(pst, con);			
		int score2 = ScoreOneToFive.q2(pst, con);
		int score3 = ScoreOneToFive.q3(pst, con);
		int score4 = ScoreOneToFive.q4(pst, con);
		int score5 = ScoreOneToFive.q5(pst, con);
		int score6 = ScoreSixToTen.q6(pst, con);	
		int score7 = ScoreSixToTen.q7(pst, con);
		int score8 = ScoreSixToTen.q8(pst, con);
		int score9 = ScoreSixToTen.q9(pst, con);
		int score10 = ScoreSixToTen.q10(pst, con);
		
		int scoreC1 = score1+score2+score3+score4+score5;
		int scoreC2 = score6+score7+score8+score9+score10;
		int scoreC = scoreC1 + scoreC2;
		
		System.out.println("Total score : "+scoreC);
	
		String R1 = "update studentdata set score =? where id = "+id;
		pst = con.prepareStatement(R1);
		//change id for different student
		pst.setInt(1, scoreC);//scoreC
		
		int n = pst.executeUpdate();
		
		String studentDataDisplay = "select * from studentdata";
		pst = con.prepareStatement(studentDataDisplay);
		ResultSet studResultSet = pst.executeQuery();
		
		while(studResultSet.next())
		{
			if(studResultSet.getRow()==rowId)	//choosing row
			{
			sResult.add(studResultSet.getInt(1));
			sResult.add(studResultSet.getString(2));
			sResult.add(studResultSet.getInt(3));
			}
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}finally
		{
			try {
//				con.close();
//				pst.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sResult;
	}
}
