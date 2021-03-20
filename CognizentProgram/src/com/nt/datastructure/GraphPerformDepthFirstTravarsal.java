package com.nt.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphPerformDepthFirstTravarsal {
private int V;
private LinkedList<Integer> d[];

GraphPerformDepthFirstTravarsal(int v)
{
	V=v;
	d=new LinkedList[v];
	for(int i=0;i<v;++i)
	{
		d[i]=new LinkedList();
	}
}
public void DFSUtil(int v,boolean visited[])
{
	visited[v]=true;
	System.out.print(v+"   ");
	Iterator<Integer> it=d[v].listIterator();
	while(it.hasNext())
	{
		int n=it.next();
		if(!visited[n])
		DFSUtil(n,visited);
	}
 }
public void addEdges(int n,int w)
{
	d[n].add(w);
}
public void dFS(int s)
{
	boolean[] visited=new boolean[V];
	DFSUtil(s,visited);
}
	public static void main(String[] args) {
		GraphPerformDepthFirstTravarsal g=new GraphPerformDepthFirstTravarsal(4);
		g.addEdges(0, 1);
		 g.addEdges(0, 2); 
	      g.addEdges(1, 2); 
	      g.addEdges(2, 0); 
	        g.addEdges(2, 3); 
	        g.addEdges(3, 3); 
	  
	        System.out.println("Following is Depth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.dFS(2); 

	}

}
