package com.nt.simple;

import java.util.Scanner;

public class GenerateTheTable {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int tableof=Integer.parseInt(sc.next());
		  for(int i=1;i<=10;i++)
		  {
			  System.out.print(i*tableof+"  ");
		  }
	}

}
