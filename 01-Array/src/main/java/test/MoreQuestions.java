package test;

import java.util.Arrays;
import java.util.Scanner;

public class MoreQuestions {

	public static void main(String[] args) throws Exception {

//		 int sum=0;
//		int arr[]= {5,6,1,10,56,35,41,14};
//		for(int i=0;i<=arr.length-1;i++) {
//            sum=sum+arr[i];
//		}
//		System.out.println("sum : "+sum);
//
//*******************************************************************
// Question2-sum of even numbers?

//		int even=0;
//		int arr[]= {10,15,20,25,30,35,40,45,55};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				even=even+arr[i];
//			}
//		}
//		System.out.println("Even Number's Sum is : "+even);
//
//*************************************************************************
// Questiom-3 sum of odd numbers?

//		int odd = 0;
//		int arr[] = { 10, 20, 30, 45, 5, 15 };
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 != 0) {
//				odd += arr[i];
//			}
//		}
//		System.out.println("Odd Number's Sum is : " + odd);

//*****************************************************************************		
//Question 4-find the greatest number?

//		int temp = 0;
//		int arr[] = { 5, 6, 8, 3, 21, 45, 7 };
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > temp) {
//				temp = arr[i];
//			}
//		}
//		System.out.println(temp);

//*****************************************************************************		
//Question 5-remove dublicates elements from an array?
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 1; j < arr.length; j++)
//				if (arr[i] == arr[j]) {
//					temp = arr[j];
//				}
//		}
//		System.out.println("Dublicates elements: " + temp);
//
//	}
//}
		
//************************************************************************
//Question-6-WAP to find the index of an array element?

//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("enter the element to find: ");
//		int a = sc.nextInt();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == a) {
//				System.out.println("index number is: " + i);
//			}
//		}
//	}
//   }
//**********************************************************************************************		
//Question-7-WAP to sort an array?	
//		int arr[] = { 1, 5, 9, 2, 0,2,3,4, 1, 7 };
//		int temp = 0;
//		System.out.println("Original array: " + Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//
//				}
//			}
//
//		}
//		System.out.println("Sorted array: " + Arrays.toString(arr));

//************************************************************************************************		
//  Question-8 Develop a program to create an array with diff integer value and 
//		sort them in the order of acending and dec order

		int arr[] = { 1, 5, 8, 6, 3, 1, 4, 7, 25, 89 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp=arr[j];
					arr[i]=arr[j];
					arr[i]=temp;
					
				}

			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
