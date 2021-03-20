package com.nt.test;

import java.util.Scanner;

public class ExampleCheckLCMofTheNumber {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm=n1>n2?n1:n2;
		while(true) {
			if(lcm%n1==0&&lcm%n2==0) {
				System.out.println("The Lcm of the Number :"+lcm );
				break;
			}//if
			lcm++;
		}//while
		
sc.close();
	}//main

}//class
