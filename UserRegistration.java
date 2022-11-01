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
	}
}
