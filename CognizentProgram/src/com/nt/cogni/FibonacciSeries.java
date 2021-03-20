package com.nt.cogni;
public class FibonacciSeries {
        public static void main(String[] args) {
		int n=1;
		int t1=0;
		int t2=1;
		while(n<=100)
		{  System.out.print(t1+" ");
			int c=t1+t2;
			t1=t2;
			t2=c;
			n++;   }
		
	 }
}
