package com.service;

public class CredentialService {
	
	public String company = "accor.com";
		
	public String getcompany() {
		return company;
	}
	
	public void setcompany(String company) {
		this.company = "accor.com";
	}
	// Generating Email Address
	
	public String generateEmailAddress(String firstName, String lastName, String department, String company) {
		
		return firstName+lastName+"@"+department+"."+company;
	}
	
	// Generating a Random Password
	
	public String generatePassword(int length) {
		String PasswordSet = "abdcefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%&*";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random()* PasswordSet.length());
			password[i] = PasswordSet.charAt(rand);
		}
		
		return new String (password);
	}
	
	// Showing all the information
	
	public void showCredential(String firstName, String email, String generatepassword) { 
		
		System.out.println("Dear "+firstName+"  your credentials are as follows");
		System.out.println("Email---->" +email);
		System.out.println("password---->" +generatepassword);
		
	}
}
