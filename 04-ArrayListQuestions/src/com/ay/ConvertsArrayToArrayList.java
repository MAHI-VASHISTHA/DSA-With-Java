package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertsArrayToArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		Integer [] arr=list.toArray(new Integer[0]);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
