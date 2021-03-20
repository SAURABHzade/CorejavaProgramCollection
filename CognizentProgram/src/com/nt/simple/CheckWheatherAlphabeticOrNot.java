package com.nt.simple;

public class CheckWheatherAlphabeticOrNot {

	public static void main(String[] args) {
		// char ch='a';
			/*
			 * if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			 * System.out.println("It is Alphabetic Character"); } else
			 * System.out.println("It is not an Alphabetic Charater");
			 */
		/*
		 * if(Character.isAlphabetic(ch)) {
		 * System.out.println("It is Alphabetic Charater"); } else
		 * System.out.println("It is not Alphabetic Charater");
		 */
		 char fc='9';
		 if(Character.isLetter(fc))
		 {
			 System.out.println("Yes");
		 }
		 else
			 System.out.println("No");
		 
		}
	}
