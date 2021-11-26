package com.example.demo.ui.model.response;

public class UserRest {

	private String User_ID;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Password;
	private String CountryCode;
	private String Phone_Number;
	private Boolean Is_Admin;
	private Boolean Subscrption;
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	public Boolean getIs_Admin() {
		return Is_Admin;
	}
	public void setIs_Admin(Boolean is_Admin) {
		Is_Admin = is_Admin;
	}
	public Boolean getSubscrption() {
		return Subscrption;
	}
	public void setSubscrption(Boolean subscrption) {
		Subscrption = subscrption;
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
	
	
}
