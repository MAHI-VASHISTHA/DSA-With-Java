package com.ay;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[]= {2,0,9,6,15,7,3,4,20};
		
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
