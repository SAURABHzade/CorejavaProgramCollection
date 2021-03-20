package com.nt.simple;
import java.util.Scanner;
public class ChracterSearchingMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char ch[]=(input).toCharArray();
		int count=0;
		int count1=0,count2=0,count3=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isWhitespace(ch[i]))
				 count++;
			if(Character.isLowerCase(ch[i]))
			count1++;
			if(Character.isUpperCase(ch[i]))
		         count2++;
			if(Character.isLetterOrDigit(ch[i]))
		       count3++;
		//	if(Character.is)
		}
		System.out.println("Count ::"+count);
        System.out.println("Lowercase "+count1);
        System.out.println("UpperCase :"+count2);
        System.out.println("length"+input.length());
        System.out.println("isLetterOrDigit::"+count3);
	}

}
