package com.ay;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoList {

	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList(Arrays.asList(5,3,6,1,2,4));
		ArrayList<Integer> arr1=new ArrayList(Arrays.asList(10,20,30,40,50));

		arr.addAll(arr1);
		System.out.println(arr);
	}

}
