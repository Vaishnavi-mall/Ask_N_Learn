package com.AskNLearn.model;
public class question 
{

	private int q_id;
	private int q_u_id;
	private String ques;
	private String department;
	
		
	public question() {
		super();
	}
	public question(int q_id, int q_u_id, String ques, String department) {
		super();
		this.q_id = q_id;
		this.q_u_id = q_u_id;
		this.ques = ques;
		this.department = department;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public int getQ_u_id() {
		return q_u_id;
	}
	public void setQ_u_id(int q_u_id) {
		this.q_u_id = q_u_id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	
	
	
	
	
}

