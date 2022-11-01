package com.Bridgelabz.Day17;

import java.util.Scanner;

public class UserRegistration {
	// Method for validation of first name -- UC1
	public static boolean firstName(String firstname) {
		return firstname.matches("^[A-Z]{1}[a-zA-Z]{2,}$");
	}

	// Method for validation of last name -- UC2
	public static boolean lastName(String lastname) {
		return lastname.matches("^[A-Z]{1}[a-zA-Z]{2,}$");
	}

	// Method for validation of Email -- UC3
	public static boolean Email(String email) {
		return email.matches("^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$");
	}

	// Method for validation of Mobile number -- UC4
	public static boolean mobileNumber(String mobilenum) {
		return mobilenum.matches("^[0-9]{2}[\s][0-9]{10}$");
	}

	public static void main(String[] args) {
		System.out.println("Welcome in User registration program using Regex");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstname = input.next();
		if (firstName(firstname)) {
			System.out.println(firstname + " : is a valid first name ");
		} else {
			System.out.println(firstname + " : is a invalid first name ");
		}
		System.out.println("Enter Last Name");
		String lastname = input.next();
		if (lastName(lastname)) {
			System.out.println(lastname + " : is a valid last name ");
		} else {
			System.out.println(lastname + " : is a invalid last name ");
		}
		System.out.println("Enter Email id");
		String email = input.next();
		if (Email(email)) {
			System.out.println(email + " : is a valid email id");
		} else {
			System.out.println(email + " : is a invalid email id");
		}
		System.out.println("Enter mobile number");
		input = new Scanner(System.in);
		String mobilenum = input.nextLine();
		if (mobileNumber(mobilenum)) {
			System.out.println(mobilenum + " : is a valid mobile number");
		} else {
			System.out.println(mobilenum + " : is a invalid mobile number");
		}
	}
}
