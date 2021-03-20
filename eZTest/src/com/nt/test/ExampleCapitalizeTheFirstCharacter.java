package com.nt.test;

import java.util.Scanner;

public class ExampleCapitalizeTheFirstCharacter {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	  String ss=sc.nextLine();
	  String s[]=ss.split(" ");
	  String p="";
	  for(int i=0;i<s.length;i++)
	  {   
		 p=p+String.valueOf(Character.toUpperCase(s[i].charAt(0)))+s[i].substring(1).toLowerCase()+" ";
	  }
	  
	  System.out.println(p);
		/*
		 * for(int i=0;i<s.length;i++) {
		 * 
		 * 
		 * //
		 * p=p+String.valueOf(Character.toUpperCase(s[i].charAt(0)))+s[i].substring(1)
		 * +" "; }
		 */
   	//	System.out.println(p);
		

	}//main

}//class
