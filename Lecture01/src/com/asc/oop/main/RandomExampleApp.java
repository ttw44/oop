package com.asc.oop.main;

import java.util.Scanner;

public class RandomExampleApp 
{
	public static void main(String[]args)
	{
		System.out.println("Welcome to the program. \n Enter your name in the following format: [first last]");
		String input = "";
		String fname;
		String lname;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		fname = input.substring(0, input.indexOf(' ', 0));
		lname = input.substring(input.indexOf(' ', 0) + 1);
		
		System.out.println("Print");
		
		System.out.println("Your name is: " + fname + " " + lname);
		sc.close();
	}
}
