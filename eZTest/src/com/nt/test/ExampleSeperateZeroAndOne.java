package com.nt.test;

import java.util.Arrays;

public class ExampleSeperateZeroAndOne {

	public static void main(String[] args) {
	  int a[]=new int[] {0,0,1,0,1,1,1,0,0,1,0,1,1,0,0,1,1,0,0,0,1,1};
      for(int i=0;i<a.length;i++) {
    	  if(a[i]!=0) {
    		  for(int j=i+1;j<a.length;j++) {
    			  if(a[j]==0) {
    				  int temp=a[j];
    				  a[j]=a[i];
    				  a[i]=temp;
    			  }
    		  }
    	  }
      }
      System.out.println(Arrays.toString(a));
	}

}
