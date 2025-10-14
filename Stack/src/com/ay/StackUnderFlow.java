package com.ay;

import java.util.Stack;

public class StackUnderFlow {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack();
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		System.out.println(st);
		
		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

	}

}
