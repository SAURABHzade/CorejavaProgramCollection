package com.nt.datastructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAurLinkedListKaMatter {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
	    queue.add("saurabh");
		queue.add("shubham");
		queue.add("Aditya");
            System.out.println(queue.peek());
            System.out.println(queue.remove());
            System.out.println(queue);
            System.out.println(queue.element());
           // System.out.println(queue.remove());
	}

}
