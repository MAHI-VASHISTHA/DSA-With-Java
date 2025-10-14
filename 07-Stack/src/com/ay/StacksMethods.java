package com.ay;

import java.util.Stack;

public class StacksMethods {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack();
		System.out.println(st.isEmpty());

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println(st);
//		Stack's size

		st.size();
		System.out.println("size is :" + st.size());

//      Remove last element 

		st.pop();
		System.out.println(st);

//		also remove last elements
		
		st.peek();
		System.out.println(st);

		System.out.println(st.isEmpty());

		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st);

	}

}
