package com.nt.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvetingPremitiveInttoListtoPrimitiveInt {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of element");
	   int n=sc.nextInt();
	   System.out.println("Enter the element");
	   int a[]=new int[n];
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   
	   List<Integer>  list=Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
	   //Collections.swap(list, 34, 12);
	   System.out.println(list.toString());
	   Collections.shuffle(list);
	  // Collections.
	  System.out.println(list.toString());
		/*
		 * int arr[]=list.stream().mapToInt(Integer::intValue).toArray(); // Integer[]
		 * att=list.toArray(new Integer[0]); for(int i=0;i<arr.length;i++) {
		 * System.out.print(arr[i]+"  "); }
		 */	 
	
	
	
	}

}
