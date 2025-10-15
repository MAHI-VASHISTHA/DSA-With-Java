package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertsArrayListToArray {

	public static void main(String[] args) {
		Integer arr[] = { 10, 21, 85, 63, 41, 20 };
		
		ArrayList<Integer> ar=new ArrayList(Arrays.asList(arr));
		System.out.println(ar);

	}

}
