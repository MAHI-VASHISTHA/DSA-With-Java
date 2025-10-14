package com.ay;

import java.util.Arrays;

public class BubbleSortReverse {

	public static void main(String[] args) {

		int arr[]= {5,3,9,7,1,4,-5,2,15};
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
