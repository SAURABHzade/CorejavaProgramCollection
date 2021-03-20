package com.nt.test;
import java.util.Scanner;
public class ExampleCountingCharacterAndReturnNumber {
static Scanner sc=new Scanner(System.in);
        public static  void periodic(String dd) {
        char ch=dd.charAt(0);
        int p=1;
        String add="";
        for(int i=1;i<dd.length();i++) {
             if(ch==dd.charAt(i)) {
        		p++;
        	}
             else {
            	 add=add+ch+p;
            	 p=1;
            	 ch=dd.charAt(i);
             }
        }
        add=add+ch+p;
        System.out.println(add);
 }//periodic
     public static void main(String[] args) {
      String str=sc.next();
      periodic(str);
		
   
	}//main

}//class
