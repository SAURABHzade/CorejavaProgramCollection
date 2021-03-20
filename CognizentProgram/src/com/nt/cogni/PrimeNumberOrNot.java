package com.nt.cogni;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;
public class PrimeNumberOrNot {
   public static boolean primeOrNot(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return true;
	   }
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.next());
	
		if(primeOrNot(num))
			System.out.println("The Number is not prime");
		else
			System.out.println("The number is prime");
	sc.close();
	}
	
}
