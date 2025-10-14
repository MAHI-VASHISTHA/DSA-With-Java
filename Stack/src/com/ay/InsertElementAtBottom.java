package com.ay;

import java.util.Stack;

public class InsertElementAtBottom {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		Stack<Integer> rt=new Stack();
		while(st.size()>0) {
			rt.push(st.pop());
		}
		st.push(0);
		while(rt.size()>0) {
			st.push(rt.pop());
		}
		System.out.println(st);

	}

}
