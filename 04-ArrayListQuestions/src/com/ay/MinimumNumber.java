package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumNumber {

	public static void main(String[] args) {


		ArrayList<Integer> arr=new ArrayList(Arrays.asList(5,3,6,1,20,4));

		int min=Collections.min(arr);
		System.out.println("minimum element is: "+min);
	}

}
