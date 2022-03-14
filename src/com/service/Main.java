package com.service;

import java.util.Scanner;

import com.Employee.*;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("Shambhavi","Preetham");
		CredentialService c = new CredentialService();
		String email;
		String generatePassword;
		
		//Ask for department
		
		System.out.println("Enter your choice to select the department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
			email = c.generateEmailAddress(e.getfirstName(),e.getlastName(), "tech", c.company);
			generatePassword = c.generatePassword(8);
			c.showCredential(e.getfirstName(), email, generatePassword);
		}
		
		else if (choice == 2) {
			email = c.generateEmailAddress(e.getfirstName(),e.getlastName(), "adm", c.company);
			generatePassword = c.generatePassword(8);
			c.showCredential(e.getfirstName(), email, generatePassword);
		}
		
		else if (choice == 3) {
			email = c.generateEmailAddress(e.getfirstName(),e.getlastName(), "hr", c.company);
			generatePassword = c.generatePassword(8);
			c.showCredential(e.getfirstName(), email, generatePassword);
		}
		
		else if (choice == 4) {
			email = c.generateEmailAddress(e.getfirstName(),e.getlastName(), "lgl", c.company);
			generatePassword = c.generatePassword(8);
			c.showCredential(e.getfirstName(), email, generatePassword);
		}
		
		else
			System.out.println("Invalid choice");
		
		sc.close();
		}

	}

