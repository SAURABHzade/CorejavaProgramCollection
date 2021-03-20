package com.nt.test;

import java.util.Arrays;

public class ExampleToSeperateEvenAndOddNumber {

	public static void main(String[] args) {
	
   int A[]=new int[] {21,43,22,67,66,56,25,98,77,99,48,74,33};
   int index=0;   
   for(int i=0;i<A.length;i++) {
    	           if(A[i]%2==0) {
    	        	   int temp=A[index];
    	        	   A[index]=A[i];
    	        	   A[i]=temp;
    	        	   index++;
    	           }
    	     }//for
System.out.println(Arrays.toString(A));
	}//main

}//class
