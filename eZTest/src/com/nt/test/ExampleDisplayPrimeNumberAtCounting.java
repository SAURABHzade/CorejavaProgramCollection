package com.nt.test;

import java.util.Scanner;



public class ExampleDisplayPrimeNumberAtCounting {
static Scanner sc=new Scanner(System.in);
public static boolean primeOrNot(int o) {
	for(int i=2;i<=o/2;i++) {
		if(o%i==0) {
			return false;
		}
	}
	return true;
}
public static int primeNumberCount(int num) {
	int x=0;
	int count=0;
	for(int i=2;i<1000;i++) {
		if(primeOrNot(i)) {
			count++;
		}
		if(count==num) {
			x=i;
			break;
		}
	}
	return x;
}
public static void main(String[] args) {
int x=	primeNumberCount(sc.nextInt());
		System.out.println(x);
	}

}
