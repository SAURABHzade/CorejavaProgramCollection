package com.nt.simple;

import java.util.Scanner;

public class CheckWhetherNumberIsNEONOrNot {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.next());
      int square=num*num;
      int sum=0;
      while(square>0)
      {
    	  sum=sum+square%10;
    	  square=square/10;
      }
      if(sum==num)
    	  System.out.println("The Given number is neon");
      else
    	  System.out.println("The Given number is not neon");
	}

}
