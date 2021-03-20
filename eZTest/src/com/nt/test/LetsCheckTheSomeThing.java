package com.nt.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LetsCheckTheSomeThing {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		 String str=sc.nextLine();
		 str=Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));
		 System.out.println(str);

	}

}
