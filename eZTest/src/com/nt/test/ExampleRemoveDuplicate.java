package com.nt.test;
import java.util.Arrays;
import java.util.Scanner;
public class ExampleRemoveDuplicate {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
       String str=sc.nextLine();
       String s[]=str.split(" ");
       //System.out.println(Arrays.toString(s));
       String st="";
       abc:for(int i=0;i<s.length;i++) {
    	   int p=i+1;
    	   if(p<s.length) {
    	   if(s[i].equals(s[p])) {
    		   //--i;
    		   continue abc;
    	   }//if
    	}//if
    	   st=st+s[i]+" ";
       }
       System.out.println(st);
   }//main

}//class
