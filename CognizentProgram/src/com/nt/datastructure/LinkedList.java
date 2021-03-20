package com.nt.datastructure;
import com.nt.datastructure.Node;
public class LinkedList {
Node head;
public LinkedList()
{
	head=null;
}

//Deleting the node
public void deleteNode(int key)
{
	Node temp=head,prev=null;
	if(temp!=null&&temp.data==key)
	{
		head=temp.next;
		return;
	}
	while(temp!=null&&temp.data!=key)
	{
		prev=temp;
		temp=temp.next;
	}
	if(temp==null)
		return;
	
	prev.next=temp.next;
}



//method for inserting the node 
public void push(int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}



//method for inserting the node between the linked list
public void insertAfter(Node pre_node,int new_data)
{
	if(pre_node==null)
	{
		System.out.println("The given previous node can not be null");
		return;
	}
	
	Node new_node=new Node(new_data);
	Node tnode=pre_node.next;
    pre_node.next=new_node;
    new_node.next=tnode;
    return;
    }

//Method for append the node to the linked list
public void append(int new_data)
{
	Node new_node =new Node(new_data);
	if(head==null)
	{
		head=new Node(new_data);
		return;
	}
	new_node.next=null;
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=new_node;
	return;
}

//Method for printing the linked list
public void printList()
{
	Node tnode=head;
	while(tnode!=null)
	{
		System.out.print(tnode.data+"<--");
		tnode=tnode.next;
	}
}


	public static void main(String[] args) {
	
		 /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
        llist.append(6); 
  
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.push(7); 
  
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.push(1); 
  
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        llist.append(4); 
  
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        llist.insertAfter(llist.head.next, 8); 
      
        System.out.println("\nCreated Linked list is: "); 
        llist.printList();
        llist.deleteNode(3);
        System.out.println("\nCreated Linked list is: "); 
        llist.printList();
        
	 }
}
