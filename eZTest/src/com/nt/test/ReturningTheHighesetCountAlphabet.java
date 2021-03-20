package com.nt.test;

import java.util.Scanner;

public class ReturningTheHighesetCountAlphabet{
	static Scanner sc=new Scanner(System.in);
	
	public static int calculateHighestcountVariable(String s) {
		int max=0;
		char ch='\u0000';
		String p=s.replaceAll(" ","");
		abc:for(int i=0;i<p.length();i++) {
			
			int l=0;
			for(int j=i;j<p.length();j++) {
			 
				for(int k=i-1;k>=0;k--) {
				    	 if(p.charAt(i)==p.charAt(k))
				    		// System.out.print(p.charAt(k));
				    		 continue abc;
				     }//for
		
				     if(p.charAt(j)==p.charAt(i)) {
				    	 l++;
				    	// System.out.println("Hello");
				    	 //System.out.print(l);
				     }//if
       		}//for
			if(max<l) {
		      max=l;	
			ch=p.charAt(i);
			}
}//for
		System.out.println(ch);
		return max;
	}//method
	public static void main(String[] args) {
		String s="pppp";
		int p=9;
		char ch='9';
		System.out.println(Character.getNumericValue(ch));
		String ss=String.valueOf(p);
		System.out.println("s"+s);
		System.out.println(calculateHighestcountVariable(sc.nextLine()));
	}//main
	
	
}//class