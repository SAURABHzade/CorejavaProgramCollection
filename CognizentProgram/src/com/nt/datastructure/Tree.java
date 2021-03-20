package com.nt.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree
{
     static class Node
      {
	Node left,right;
	int value;
	Node(int value)
	{
		this.value=value;
	   left=right=null;	
	}
}
     
public void insert(Node node,int value)
{
	if(value<node.value)
	{
		if(node.left!=null)
		{
		 insert(node.left,value);
		}
		else
		{
			System.out.println("Inserted node of  " +value+" to the left of  "+node.value);
			node.left=new Node(value);
		}
		
	}
	else if(value>node.value)
	{
		if(node.right!=null)
		insert(node.right,value);
        else
        {
		node.right=new Node(value);
		System.out.println("Inserted node of  "+value+" to the right of  "+node.value);
        }
	}
}








	public static void travarsalnsert(Node node)
	{
		if(node!=null)
		{
			travarsalnsert(node.left);
			System.out.print(" "+node.value);
           travarsalnsert(node.right);		
		}
	}
   public static void main(String args[])	
   {
	  Tree tree=new Tree();
	  Node node=new Node(5);
System.out.println("Binary Tree Example::");
System.out.println("Binary Tree root element is"+node.value);
	  tree.insert(node, 2);
	  tree.insert(node,4);
	  tree.insert(node,8);
	  tree.insert(node,6);
	  tree.insert(node, 7);
	  tree.insert(node,3);
	  tree.insert(node,9);
	  
	  System.out.println("Travarsing the Tree ");
	  tree.travarsalnsert(node);
	  
   }
	
	



}