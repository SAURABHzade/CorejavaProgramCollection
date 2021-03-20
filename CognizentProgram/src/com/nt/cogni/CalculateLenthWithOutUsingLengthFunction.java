package com.nt.cogni;
import java.util.Scanner;
public class CalculateLenthWithOutUsingLengthFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i=0;
		char ch[]=s.toCharArray();
		for(char c:ch)
		{
			i++;
		}
		System.out.println("Length of String :"+i);

	}//main

}//class
