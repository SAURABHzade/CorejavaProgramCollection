package com.nt.array;
import java.util.Scanner;
public class RemovingDuplicateOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.next());
        int a[]=new int[size];
        int b[]=new int[size];
        int o=0;
        //String str="";
      for(int i=0;i<a.length;i++)
      a[i]=sc.nextInt();
      //now write for removing the duplicate from it
     abc:for(int i=0;i<a.length;i++)
     {
    	 int p=i;
    	  if(++p<a.length)
    	  {
    		  if(a[p]==a[--p])
    		  {
    			// System.out.print(a[i]+" ");
    			  continue abc;
    		  }
    	 }
    	  b[o++]=a[i];
    	  
     }
        for(int i=0;i<b.length;i++)
        {
        	if(b[i]!=0)
        	System.out.print(b[i]+" ");
        }

	}

}
