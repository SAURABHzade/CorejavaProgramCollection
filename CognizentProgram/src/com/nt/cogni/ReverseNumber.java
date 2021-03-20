package com.nt.cogni;
import java.util.Scanner;

public class ReverseNumber {
   public static int reverseNum(int num)
{  
	   int p=0;
	while(num!=0)
	{
		//int x=num%10;
		p=(num%10)+p*10;
		num=num/10;
	}
	return p;
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Num=sc.nextInt();
    int k=reverseNum(Num);
    System.out.println(k);
	}

}
