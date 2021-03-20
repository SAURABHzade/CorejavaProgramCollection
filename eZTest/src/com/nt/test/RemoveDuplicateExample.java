package com.nt.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateExample {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		 String str=sc.nextLine();
		 String rgex="(\\b[A-Za-z0-9]+\\b)(\\s*\\1\\b)+";
		 Pattern pattern=Pattern.compile(rgex);
		 Matcher match=pattern.matcher(str);
		 while(match.find())
		 {
			str= str.replaceAll(match.group(),match.group(1));
		 }
System.out.println(str);
	}

}
