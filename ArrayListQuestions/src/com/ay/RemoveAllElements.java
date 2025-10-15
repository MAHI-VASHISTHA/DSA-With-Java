package com.ay;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllElements {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList(Arrays.asList(10,20,30,40,50));
		
		al.clear();
		System.out.println(al);
	}

}
