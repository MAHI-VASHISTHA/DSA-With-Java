package com.ay;

import java.util.Arrays;

public class ZerosToEnd {

	public static void main(String[] args) {

		int arr[]= {5,3,9,0,4,0,-5,7,0,0,2};
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]==0) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
