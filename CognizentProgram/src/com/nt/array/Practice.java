package com.nt.array;

public class Practice {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<10;i++)
		{
			//int p=i;
			System.out.println("Before::"+i);
			if((++i)==i)
			{  
			
				count++;
			}
			System.out.println(i);			
			
		}
System.out.println("Total::"+count);
	}

}
