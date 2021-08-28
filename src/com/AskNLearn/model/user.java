package com.AskNLearn.model;

public class user
{
	
private int user_id;
private String first_name;
private String last_name;
private String email_id;
private String pass_word;


public user() {
	super();
}


public user(String first_name, String last_name, String email_id, String pass_word) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.email_id = email_id;
	this.pass_word = pass_word;
}


public int getUser_id() {
	return user_id;
}


public void setUser_id(int user_id) {
	this.user_id = user_id;
}


public String getFirst_name() {
	return first_name;
}


public void setFirst_name(String first_name) {
	this.first_name = first_name;
}


public String getLast_name() {
	return last_name;
}


public void setLast_name(String last_name) {
	this.last_name = last_name;
}


public String getEmail_id() {
	return email_id;
}


public void setEmail_id(String email_id) {
	this.email_id = email_id;
}


public String getPass_word() {
	return pass_word;
}


public void setPass_word(String pass_word) {
	this.pass_word = pass_word;
}









}
