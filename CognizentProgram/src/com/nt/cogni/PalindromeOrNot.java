package com.nt.cogni;

import java.util.Scanner;

public class PalindromeOrNot {
public static boolean palindromOrNot(String s)
{ 
	String k=new StringBuilder(s).reverse().toString();
	if(k.equals(s))
	{
		return true;
	}
	
return false;	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		 
   System.out.println(palindromOrNot(str));
	}

}
