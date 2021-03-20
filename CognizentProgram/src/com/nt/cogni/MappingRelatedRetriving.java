package com.nt.cogni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MappingRelatedRetriving {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		Map<String,Long>  map=new HashMap<>();
		List<String>  list=new ArrayList<>();
		int count=0;
       while(testCases-->0)
		{
			String name=sc.next();
			Long phone=Long.parseLong(sc.next());
			count++;
			map.put(name,phone);
		}
       while(count-->0)
       {
    	   String s=sc.next();
    	   list.add(s);
       }
		for(int i=0;i<list.size();i++)
		{
			if(map.containsKey(list.get(i)))
			{
				System.out.println(list.get(i)+"="+map.get(list.get(i)));
				}
			else
				System.out.println("Not Found");
		}
       
	}

}
