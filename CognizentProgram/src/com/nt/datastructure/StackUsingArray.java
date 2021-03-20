package com.nt.datastructure;

public class StackUsingArray {
    int size;
    int arr[];
    int top;
	StackUsingArray(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	
	public void push(int pushElement)
	{
		if(!isFull())
		{
			top++;
			arr[top]=pushElement;
			System.out.println("Element is Pushed::"+pushElement);
		}
		else
		{
			System.out.println("StackUsingArray is full");
		}
	}
	public int peek()
	{
	if(!isEmpty())
	{
		return arr[top];
	}
	else
	{
		System.out.println("StackUsingArray is Empty");
		return -1;
	}
	}

	public int pop()
	{
		if(!isEmpty())
		{int deletevar=top;
		top--;
			return arr[deletevar];
		}
		else
		{
		 System.out.println("StackUsingArray is Empty");
			return -1;
		}
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public static void main(String[] args) {
	StackUsingArray StackUsingArray=new StackUsingArray(10);
	StackUsingArray.pop();
	StackUsingArray.push(23);
	StackUsingArray.push(34);
	StackUsingArray.push(12);
	System.out.println("The Peek Eleement become::"+StackUsingArray.peek());
	}

}
