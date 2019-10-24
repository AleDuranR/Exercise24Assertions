package com.exercise24assertions.app;
import java.util.Scanner;
public class AssertionsApp {
	/*
	 * Assertion
	 * It is a Boolean-value function that evaluates a point in the 
	 * code execution, use only to check assumptions at runtime.
	 */
	public static void main(String[] args) {
		// Variables declaration
		int age = 0;
		
		// Object construction
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.println("Are you over 18 year old? Input your age");
		age = scan.nextInt();
		// Calling method isOverAge
		System.out.println(isOverAge(age));
		
		scan.close();
	}
	// The method function that will implement assertion
	public static String isOverAge(int age) {
		String response = "";
		// !! if age is bigger that 0, it will continue with the code
		assert age > 0 :"Invalid age, ONLY possitive values";
		if(age < 18) {
			System.out.println("Under age");
		}
		if(age >= 18) {
			System.out.println("Age above the limit");
		}
		return response;	
	}
}
