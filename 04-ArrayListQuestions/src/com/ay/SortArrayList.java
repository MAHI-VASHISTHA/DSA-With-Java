package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList(Arrays.asList(14,56,3,2,85,30,50));
		Collections.sort(arr);
		System.out.println(arr);
	}

}
