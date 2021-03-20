package com.nt.datastructure;
import com.nt.datastructure.QNode;
public class QueueUsingLinkedList {
  QNode front,rear;
  public QueueUsingLinkedList()
  {
	  this.front=this.rear=null;
  }
  public void enQueueUsingLinkedList(int key)
  {
	  QNode temp=new QNode(key);
	  if(this.rear==null)
	  {
		  this.front=this.rear= temp;
		  return;
	  }
	  this.rear.next=temp;
	  this.rear=temp;
	  }
  public void deQueueUsingLinkedList()
  {
	  if(this.front==null)
	  {
		  return;
	  }
	  QNode temp=this.front;
	  this.front=this.front.next;
	  
	  if(this.front==null)
	  {
		  this.rear=null;
	  }
  }
	public static void main(String[] args) {
		QueueUsingLinkedList q=new QueueUsingLinkedList();
		q.enQueueUsingLinkedList(23);
		q.enQueueUsingLinkedList(26);
		q.enQueueUsingLinkedList(12);
		q.enQueueUsingLinkedList(43);
		q.deQueueUsingLinkedList();
		q.deQueueUsingLinkedList();
		System.out.println("QueueUsingLinkedList front ::"+q.front.data);
		System.out.println("QueueUsingLinkedList rear::"+q.rear.data);
	}

}
