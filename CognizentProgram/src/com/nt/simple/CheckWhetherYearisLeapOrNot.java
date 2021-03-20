package com.nt.simple;

import java.util.Scanner;

public class CheckWhetherYearisLeapOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=Integer.parseInt(sc.next());
		     boolean bo=false;
		     if(year%4==0)
		     {
		    	 if(year%100==0)
		    	 {  
		    		 if(year%400==0)
		    		       bo=true;
		    		 else
		    			 bo=false;   }
		    	 else
		    		 bo=true;
		     }
		     else
		    	 bo=false;
  if(bo==true)
  {
	  System.out.println("The year is Leap year");
  }
  else
	  System.out.println("the year is Not Leap year");
	}

}
