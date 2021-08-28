package com.AskNLearn.model;
public class answer 
{

	private int a_id;
	private int a_q_id;
	private int a_u_id;
	private String ans;
	
	public answer() {
		super();
	}

	public answer(int a_id, int a_q_id, int a_u_id, String ans) {
		super();
		this.a_id = a_id;
		this.a_q_id = a_q_id;
		this.a_u_id = a_u_id;
		this.ans = ans;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public int getA_q_id() {
		return a_q_id;
	}

	public void setA_q_id(int a_q_id) {
		this.a_q_id = a_q_id;
	}

	public int getA_u_id() {
		return a_u_id;
	}

	public void setA_u_id(int a_u_id) {
		this.a_u_id = a_u_id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
    	
	
	
	
}
