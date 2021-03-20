package com.nt.cogni;
import java.util.Scanner;
public class FactorialOfNumberUsingFactorial {
   public static int factorialNumber(int num)
       {  
	   if(num==0||num==1)
		   return 1;
	   return num*factorialNumber(num-1);
}//factorialNumber
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(factorialNumber(n));  
		}

}
