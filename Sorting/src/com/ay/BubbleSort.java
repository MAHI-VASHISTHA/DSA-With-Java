package com.ay;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 9, 1, -5, 7, 2 };
		int temp = 0;

//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//			if(arr[j]>arr[j+1]) {
//				 temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}