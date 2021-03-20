package com.nt.datastructure;
import java.util.Iterator;
import java.util.LinkedList;
public class GraphPerformBreadthFirstTravarsal {
private static int V;   //no of Vertices
private static LinkedList<Integer> adj[];//Adjedency list
public GraphPerformBreadthFirstTravarsal(int v)
{
	V=v;
	adj=new LinkedList[v];
	for(int i=0;i<v;i++)
	{
		adj[i]=new LinkedList();
	}
}
void addEdges(int v,int w)
{
	adj[v].add(w);
}

public void bFS(int s)
{
	boolean visited[]=new boolean[V];
	LinkedList<Integer> queue=new LinkedList<>();
	visited[s]=true;
	queue.add(s);
	while(queue.size()!=0)
	{
		           s=queue.poll();
		           System.out.print(s+"  ");
		       Iterator<Integer> it=adj[s].listIterator();
		       while(it.hasNext())
		       {
		    	   int n=it.next();
		    	   if(!visited[n])
		    	   {
		    		   visited[n]=true;
		    		   queue.add(n);
		    	   }
		       }
		     }
	}

	public static void main(String[] args) {
		GraphPerformBreadthFirstTravarsal g=new GraphPerformBreadthFirstTravarsal(4);
		g.addEdges(0,1);
        g.addEdges(0, 2); 
        g.addEdges(1, 2); 
        g.addEdges(2, 0); 
        g.addEdges(2, 3); 
        g.addEdges(3, 3);
		System.out.println("Following is the Breadth First Travarsal :: Starting from the vertex 2");
		g.bFS(2);

	}//main
}//class
