package com.nt.test;

import java.util.Scanner;

public class ExampleLeapYearOrNot {
  static Scanner sc=new Scanner(System.in);
	public static boolean checkLeapYearOrNot(int p) {
		if(p%4==0) {
			    if(p%100==0) {
				            if(p%400==0) {
				                      	return true;
			                       	}
				             else {
				                         return false;
			                    	}
			             }
			    else {
				    return true;
			   }
		}
		else {
			return false;
		}
	}//checkLeapYearOrNot
  
	public static void main(String[] args) {
	if(checkLeapYearOrNot(sc.nextInt()))
	{
		System.out.println("Yes : It is a Leap Year");
	}
	else{
		System.out.println("No : It is not a Leap Year");
	}//else

	}//main
}//class
