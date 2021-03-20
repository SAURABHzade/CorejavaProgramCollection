package com.nt.test;

import java.util.Scanner;

public class CheckPalinDromeOrNot {
static Scanner sc=new Scanner(System.in);
 public static boolean palindrome(String str) { 
	 String  s=new StringBuffer(str).reverse().toString();
	 if(s.equals(str)) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
public static void main(String[] args) {
		String str=sc.next();
	if(palindrome(str)) {
		System.out.println("Yes: It is PalinDrome");
	}//if
	else {
		System.out.println("No: it is not PalinDrome");
	}//else

	}//main

}//class
