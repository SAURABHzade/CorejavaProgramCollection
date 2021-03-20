package com.nt.cogni;
import java.util.Scanner;
public class RemoveDuplicateWord {
          public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String str=sc.nextLine();  
		  String strp[]=str.split(" ");
		  String str2="";
		  for(int i=0;i<strp.length;i++) {
			  System.out.println("Kya huaa");
			if(strp.length!=i++) {
				if(strp[i]==strp[i++]) {
			      }
				}
			System.out.println("mai");
			str2=str2+strp[i];
			
	 }
		System.out.print(str2);
		}

	}


