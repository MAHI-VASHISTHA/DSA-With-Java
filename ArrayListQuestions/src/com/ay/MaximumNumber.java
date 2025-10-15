package com.ay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber {

	public static void main(String[] args) {


		ArrayList<Integer> arr=new ArrayList(Arrays.asList(5,3,6,1,20,4));

		int max=Collections.max(arr);
		System.out.println("maximum element is: "+max);
	}

}
