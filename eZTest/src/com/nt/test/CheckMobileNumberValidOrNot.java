package com.nt.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobileNumberValidOrNot {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
    String regex="(0|91)?[7-9][0-9]{9}";
    String input=sc.nextLine();
    Pattern pattern=Pattern.compile(regex);
    Matcher match=pattern.matcher(input);
		if(match.find()&&match.group().equals(input)) {
			System.out.println("Yes : It is Valid Number");
		}
		else {
			System.out.println("No : It is not Valid Number");
		}

	}//main
}//class
