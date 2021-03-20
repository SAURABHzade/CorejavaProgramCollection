package com.nt.simple;

import java.util.Scanner;

public class CheckWhetherNumberIsSpyOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.next());
		int p=num;
		int product=1;
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		sum=sum+rem;
		product=product*rem;
		num=num/10;
		}
		if(sum==product)
			System.out.println("The number "+p+"  is spy");
		else
			System.out.println("The number "+p+"  is not spy");
	}

}
