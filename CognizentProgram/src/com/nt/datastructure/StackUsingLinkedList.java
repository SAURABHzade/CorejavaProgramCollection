package com.nt.datastructure;

public class StackUsingLinkedList {

 private class Node
 {
	 int data;
	 Node next; 
	 }
Node top;
StackUsingLinkedList()
{
	top=null;
}
public void push(int d)
{
	Node node=new Node();
	 if (node == null) { 
         System.out.print("\nHeap Overflow"); 
        return; 
     } 
	node.data=d;
node.next=top;
top=node;
}
public void pop()
{
	if(top==null)
	{
		System.out.println("Stack is Empty");
		return;
	}
	top=top.next;
		
}
public int peek()
{
  if(!isEmpty())
  {
	 return  top.data;
}
  else
  {
	  System.out.println("Stack is Empty");
	  return -1;
  }	
}
public boolean isEmpty()
{
	return top==null;
}
 public void display()
 {
	 if(top==null)
	 {
		 System.out.println("Stack is UnderFlow");
	 }
	 else
	 {
		 Node temp=top;
		 while(temp!=null)
		 {
			 System.out.print("-->"+temp.data);
			 temp=temp.next;
		 }
	 }
 }
	
	public static void main(String[] args) {
	  StackUsingLinkedList stack=new StackUsingLinkedList();
      stack.push(23);
      stack.push(56);
      stack.push(78);
      stack.push(89);
      stack.push(99);
      stack.pop();
      stack.display();
      System.out.println("\nTop element ::"+stack.peek());
 
	}

}
