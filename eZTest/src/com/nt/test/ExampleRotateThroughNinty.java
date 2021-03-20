package com.nt.test;

import java.util.Scanner;

public class ExampleRotateThroughNinty {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number of Rows");
		int r=sc.nextInt();
		System.out.println("Enter the Number of Column");
		int c=sc.nextInt();
        int A[][]=new int[r][c];
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
               A[i][j]=sc.nextInt();
        	}//for
        }//for
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        if(i>j) {
        		int  temp=A[i][j];
        		A[i][j]=A[j][i];
        		A[j][i]=temp;
        		}
        	}
        	
        }
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        
		System.out.print(A[i][j]+" ");
        	}
        	System.out.println();
        	}

	}

}
