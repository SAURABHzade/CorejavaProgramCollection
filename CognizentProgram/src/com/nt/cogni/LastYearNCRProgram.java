package com.nt.cogni;

import java.util.Scanner;

public class LastYearNCRProgram {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
		String add="";
		char ch=s.charAt(0);
		int p=1;
		for(int i=1;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				p++;
			}
			else
				{ 
				if(p!=0)
					add=add+ch+p;
				ch=s.charAt(i);
				p=1;
			}
		}
		add=add+ch+p;
		System.out.println(add);
	}

}
