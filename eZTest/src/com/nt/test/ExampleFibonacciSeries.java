package com.nt.test;

import java.util.Scanner;

public class ExampleFibonacciSeries {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	  int a=1;
	  int b=1,c;
	  System.out.println("Total count");
	  int n=sc.nextInt();
	  for(int i=1;i<=n;i++) {
		 c=a+b;
		 System.out.print(b+" ");
		 a=b;
		 b=c;
		 
	 }//for

	}//main

}//class
