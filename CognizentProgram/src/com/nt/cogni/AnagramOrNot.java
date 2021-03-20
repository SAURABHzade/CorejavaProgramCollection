package com.nt.cogni;
import java.util.Scanner;
public class AnagramOrNot {
public static  boolean anagramOrNot(int s)
{    int p=0;
     int u=s;
   	 while(s!=0) {
	int x=s%10;
    p=p+(int) Math.pow(x,3);
	s=s/10;
		}
	if(p==u)
		return true;
	return false;
	
}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int s=sc.nextInt();
		 
		if(anagramOrNot(s))
			System.out.println("It is an Anagram");
		else
			System.out.println("It is not an Anagram");
	}

}
