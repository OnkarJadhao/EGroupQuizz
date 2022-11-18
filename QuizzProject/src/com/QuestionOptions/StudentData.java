package com.QuestionOptions;

public class StudentData {

	private int sId;
	private String sName;
	private String sScore;
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentData(int sId, String sName, String sScore) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sScore = sScore;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsScore() {
		return sScore;
	}
	public void setsScore(String sScore) {
		this.sScore = sScore;
	}

}