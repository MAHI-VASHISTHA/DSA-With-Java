package com.a;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[]= {4,6,8,7,2,1};
		int  target=8;
		
		
		System.out.println(linear(arr, target));
	}
		public static boolean linear(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return true;
		}
		return false;
	}

}
