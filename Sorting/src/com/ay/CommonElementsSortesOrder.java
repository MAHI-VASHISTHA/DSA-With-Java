package com.ay;

import java.util.Arrays;

public class CommonElementsSortesOrder {

	public static void main(String[] args) {

		int arr[]= {5,6,9,1,7,2,3};
		int arr1[]= {3,8,4,9,1,3,45};
		int arr2[]=new int[7];
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					arr2[i]=arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
