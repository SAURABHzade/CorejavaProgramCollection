package com.nt.array;
import java.util.Scanner;
public class RemoveDuplicateNonContinuous {
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=10;
		int  arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(sc.next());
		}
		abc:for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				 if(arr[i]==arr[j])
				 {
					 
					 for(int k=j-1;k>i;k--)
					 {
						 if(arr[k]==arr[j])
		              continue abc;
				 }
					 System.out.print(arr[j]+"  ");
				 }
				
			}
		}

	}

}
