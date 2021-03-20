package com.nt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExampleOnHashMap {

	public static void main(String[] args) {
 Map<Integer,String> map=new HashMap<>();
 map.put(1, "Saurabh");
 map.put(2, "Shubham");
 map.put(3,"Aditya");
 System.out.println(map.keySet());
System.out.println(map.toString());

ArrayList<String> a=new ArrayList<>();
a.add("Saurabh");
a.add("Shubham");
a.add("Anvar");
System.out.println(a.toString());

 for(Map.Entry m:map.entrySet()) {
	 System.out.println(m.getKey()+"   "+m.getValue());
	// System.out.println(m.toString());
	 
 }

	}//main

}//class
