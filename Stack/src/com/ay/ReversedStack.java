package com.ay;

import java.util.Stack;

public class ReversedStack {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println("reversed stack: "+st);
		
		Stack<Integer> rt=new Stack();
       while(st.size()>0) {
    	   rt.push(st.pop());
       }
//		System.out.println(rt);

		Stack<Integer> gt=new Stack();
	       while(rt.size()>0) {
	    	   gt.push(rt.pop());
	       }
//			System.out.println(gt);

		       while(gt.size()>0) {
		    	   st.push(gt.pop());
		       }
				System.out.println("reversed stack: "+st);

	}

}
