package com.example.demo.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 5512315223586710044L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String User_ID;
	
	@Column(nullable=false,length=50)
	private String First_Name;
	
	@Column(nullable=false, length=50)
	private String Last_Name;
	
	@Column(nullable=false, length=120)
	private String Email;
	
	@Column(nullable=false)
	private String Encypted_Password;
	
	private String Email_Verification_Token;
	
	@Column(nullable=false )
	private Boolean Email_Verification_Status=false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEncypted_Password() {
		return Encypted_Password;
	}

	public void setEncypted_Password(String encypted_Password) {
		Encypted_Password = encypted_Password;
	}

	public String getEmail_Verification_Token() {
		return Email_Verification_Token;
	}

	public void setEmail_Verification_Token(String email_Verification_Token) {
		Email_Verification_Token = email_Verification_Token;
	}

	public Boolean getEmail_Verification_Status() {
		return Email_Verification_Status;
	}

	public void setEmail_Verification_Status(Boolean email_Verification_Status) {
		Email_Verification_Status = email_Verification_Status;
	}
		
	
	
}
