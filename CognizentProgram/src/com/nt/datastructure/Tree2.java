package com.nt.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree2
{
	private static int level=0;
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

public static boolean isSameLevel(Node current,int currentLevel)
{
	if(current==null)
		return true;
	if(current.left==null&&current.right==null) {
		if(level==0)
		{
		level=currentLevel;	
		return true;
		}
	}
		else
			return (level==currentLevel);
		
	return (isSameLevel(current.left,currentLevel+1)&&isSameLevel(current.right,currentLevel+1));
}
public int difference(Node node) {    
    int oddLevel = 0, evenLevel = 0, diffOddEven = 0;    
        
    //Variable nodesInLevel keep tracks of number of nodes in each level    
    int nodesInLevel = 0;    
        
    //Variable currentLevel keep track of level in binary tree    
    int currentLevel = 0;    
        
    //Queue will be used to keep track of nodes of tree level-wise    
    Queue<Node> queue = new LinkedList<Node>();
    //check if root is null
    if(node==null)
    {
    	System.out.println("Tree is null");
    	return 0;
    }
    else
    {
    	queue.add(node);
    	currentLevel++;
     while(queue.size()!=0)
     {
    	 nodesInLevel=queue.size();
     while(nodesInLevel>0)
     {
    	 Node current=queue.remove();
    	 if(currentLevel%2==0)
    		 evenLevel+=current.value;
    	 else
    		 oddLevel+=current.value;
    	 if(current.left!=null)
    	 {
    		 queue.add(current.left);
    	 }
    	 if(current.right!=null)
    	 {
    		 queue.add(current.right);
    	 }
    	 nodesInLevel--;
    }
     currentLevel++;
     
   }
     diffOddEven=Math.abs(oddLevel-evenLevel);
    
    
  }
    return diffOddEven;
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
	  Tree2 tree=new Tree2();
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
	  System.out.println("Difference between sum of odd level and even level nodes: " + tree.difference(node));    
   System.out.println(isSameLevel(node,3));
   }    
	  
   }
	
	