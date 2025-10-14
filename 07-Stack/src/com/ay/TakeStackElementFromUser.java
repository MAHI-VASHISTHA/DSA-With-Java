package com.ay;

import java.util.Scanner;
import java.util.Stack;

public class TakeStackElementFromUser {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements:");
		int n=sc.nextInt();
		
		Stack st=new Stack();
		System.out.println("enter the elements:");

		for(int i=0;i<=n;i++) {
			int x=sc.nextInt();
			st.push(x);
		}
		System.out.println(st);
	}

}
