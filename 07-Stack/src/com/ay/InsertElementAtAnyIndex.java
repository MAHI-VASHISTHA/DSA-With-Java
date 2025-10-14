package com.ay;

import java.util.Stack;

public class InsertElementAtAnyIndex {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		int index=2;
		int n=8;
		
		Stack<Integer> rt=new Stack();
		while(st.size()>index) {
			rt.push(st.pop());
		}
//		System.out.println(st);
		st.push(n);
		while(rt.size()>0) {
			st.push(rt.pop());
		}
		System.out.println(st);

	}

}
