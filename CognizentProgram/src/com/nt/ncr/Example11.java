package com.nt.ncr;
import java.util.Scanner;

public class Example11 {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("Enter the length of String");
	int len=Integer.parseInt(sc.nextLine());
	System.out.println("Enter the number of time replacement");
	int nt=sc.nextInt();
	String str="";
	System.out.println("Enter the String");
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++)
	{
		if(++i<s.length()) {
			if(count<=nt) {
		if(s.charAt(i)!=s.charAt(++i))
		{
			str=str+"9";
		}
	}//count
			else
				str=str+s.charAt(i);
}//len
		str=str+s.charAt(i);
		
	}//for
	
System.out.println(str.length());
	}//main

}//class
