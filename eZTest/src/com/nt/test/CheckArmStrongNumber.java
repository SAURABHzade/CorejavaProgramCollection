package com.nt.test;

import java.util.Scanner;

public class CheckArmStrongNumber {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	   int num=sc.nextInt();
	 int p=num;
	   int sum=0;
     while(num!=0) {
    	 int pp=num%10;
    	 sum=sum+(int)Math.pow(pp,3);
    	 num=num/10;
     }
     if(p==sum) {
    	 System.out.println("Yes : It is Armstrong Number");
     }//if
     else {
    	 System.out.println("No :It is Not Armstrong Number");
     }//else
     
	}//main

}//class
