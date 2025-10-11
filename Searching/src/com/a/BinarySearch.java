package com.a;

public class BinarySearch {

	public static boolean search(int arr[], int target) {
		int n = arr.length;
		int st = 0;
		int end = n - 1;

		while(st<=end) {
			int mid=(st+end)/2;
			if(target==arr[mid])
				return true;
			else if(target>arr[mid]){
					st=mid+1;
				}
			else {
				st=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 9;
		
		System.out.println(search(arr,target));
	}

}
