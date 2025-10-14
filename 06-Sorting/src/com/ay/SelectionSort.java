package com.ay;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 5, 9, 6, 4, 7, 1, -5, 2 };

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int smallIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[smallIndex]) {
					smallIndex = j;
				}
			}
			int temp = arr[smallIndex];
			arr[smallIndex] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

	// TODO Auto-generated method stub

}
