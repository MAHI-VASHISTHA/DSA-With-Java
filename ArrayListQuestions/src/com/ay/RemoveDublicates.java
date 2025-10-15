package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {

	public static void main(String[] args) {

		ArrayList<Integer> list=new  ArrayList(Arrays.asList(1,2,3,2,4,5,4));
		Set<Integer> s=new HashSet(list);
		
		list.clear();
		list.addAll(s);
		
		System.out.println(list);
		
	}

}
