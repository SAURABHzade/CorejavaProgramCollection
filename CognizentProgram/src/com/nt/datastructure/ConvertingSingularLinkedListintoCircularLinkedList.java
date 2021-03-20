package com.nt.datastructure;

public class ConvertingSingularLinkedListintoCircularLinkedList {
	   Node head;
	static class Node
	{
		int  data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public Node circularList(Node head)
	{
		Node start=head;
		while(head.next!=null) {
			head=head.next;
		}
		
		head.next=start;
		return start;
		}
	public void push(int data)
	{
	
		if(head==null)
			head=new Node(data);
		Node new_node=new Node(data);
		Node tnode=head;
		while(tnode.next!=null)
		{
			tnode=tnode.next;
		}
		tnode.next=new_node;
	}
	public static void main(String[] args) {
		
	}

}
