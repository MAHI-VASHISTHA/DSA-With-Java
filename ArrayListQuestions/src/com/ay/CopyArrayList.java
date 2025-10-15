package com.ay;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList(Arrays.asList(5,3,6,1,2,4));
		ArrayList<Integer> arr1=new ArrayList(arr);

		System.out.println(arr1);
	}

}
