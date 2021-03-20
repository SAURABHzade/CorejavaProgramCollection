package com.nt.datastructure;

public class QueueUsingArray {
private static int front,rear,capacity;
private static int QueueUsingArray[];
public QueueUsingArray(int capacity)
{
	this.capacity=capacity;
	this.front=this.rear=0;
	QueueUsingArray=new int[capacity];
}

public static void QenQueueUsingArray(int data)
{
	if(capacity==rear) {
		System.out.println("QueueUsingArray is Full");
	return;
	}
	else
	{
		QueueUsingArray[rear]=data;
		rear++;
		}
	return;
}
public static void QdeQueueUsingArray()
{
	if(front==rear)
	{
		System.out.println("QueueUsingArray is Empty");
	    return;
	}
	else
	{
		for(int i=0;i<rear-1;i++)
		{
			QueueUsingArray[i]=QueueUsingArray[i+1];
		}
		if(rear<capacity)
			QueueUsingArray[rear]=0;
		rear--;
	}
return;		
}
public  void QFront()
{
	if(front==rear)
	{
		System.out.println("QueueUsingArray is Empty");
		return;
	}
	
	System.out.println("Front element::"+QueueUsingArray[front]);
   return;
}
public void Qdisplay()
{
	if(front==rear)
	{
		System.out.println("QueueUsingArray is Empty");
     	return;
	}
	for(int i=front;i<rear;i++)
	{
		System.out.print("<--"+QueueUsingArray[i]);
	}
	return;
}
	

	public static void main(String[] args) {
QueueUsingArray q=new QueueUsingArray(10);		
q.QenQueueUsingArray(12);
q.QenQueueUsingArray(67);
q.QenQueueUsingArray(89);
q.QenQueueUsingArray(11);
q.QenQueueUsingArray(44);
q.QdeQueueUsingArray();
q.QdeQueueUsingArray();
q.QFront();
q.Qdisplay();
q.QdeQueueUsingArray();
q.QFront();
q.Qdisplay();

	}

}
