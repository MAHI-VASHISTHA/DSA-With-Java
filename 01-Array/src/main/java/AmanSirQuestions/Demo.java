package AmanSirQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
// 1.take 10 no. from user and find maximum number.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter numbers:");
//		int arr[] = new int[10];
//
//		int max = Integer.MIN_VALUE;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("maximum number is" + max);

//2.take 10 no. from user and find minimum number.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter numbers:");
//		int arr[] = new int[10];
//
//		int min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min= arr[i];
//			}
//		}
//		System.out.println("minimum number is" + min);

//3.take 10 no. from user and take a number to search from array and find the index of that number.(linear search)

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 element of an array:");
//		int arr[] = new int[10];
//
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Enter any one element from the given array:");
//		int a=sc.nextInt();
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==a) {
//				System.out.println("Index number of this element is "+i);
//
//			}
//		}
//4.copy one array's elements to another array.

//		int arr[]= {10,15,45,89,63,25,41,20};
//		System.out.println("Original array "+Arrays.toString(arr));
//
//		int[] arr1=new int[8];
//		for(int i=0;i<arr.length;i++) {
//			arr1[i]=arr[i];
//		}
//		System.out.println("Copy of array "+Arrays.toString(arr));
//
//5.copy one array's elements to another array in reverse order.

//		int arr[] = { 10, 15, 45, 89, 63, 25, 41, 20 };  
//		System.out.println("Original array " + Arrays.toString(arr));
//		
//		int[] arr1 = new int[8];
//			for(int j=0;j<arr.length;j++) {
//				arr1[j] = arr[arr.length-1-j];
//
//		}
//		
//		System.out.println("Copy of array " + Arrays.toString(arr1));

//6.Write a Java program to find the common elements between two arrays of integers.

//		int arr[] = { 10, 20, 30, 40, 5, 56, 47, 2, 50 };
//		int arr1[] = { 1, 8, 56, 98, 23, 31, 18, 24, 30,20 };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr1.length; j++) {
//
//			if (arr1[j] == arr[i])
//			
//			{
//				System.out.println("common elements are: " + arr[i]);
//			}
//			}
//		}

//7.Write a Java program to find the second largest element in an array. 
		
				List<Integer> l = Arrays.asList(24, 56, 45, 85, 25, 32, 45, 63,63,85);
				
				Set<Integer> set = new HashSet<Integer>(l);

				int largest = Integer.MIN_VALUE;
				int second_Largest = Integer.MIN_VALUE;
				
				for(int i : l) {
					if (i>largest) {
						second_Largest = largest;
						largest = i;
					}
					else if (i>second_Largest && i<largest) {
						second_Largest =i;
					}
				}
				
				System.out.println(second_Largest);
				System.out.println(set);
			}
		
//8.Write a Java program to test the equality of two arrays. 
//		Scanner sc = new Scanner(System.in);
//		int arr[] = { 10, 5, 9, 6, 3, 1, 4, 7, 8 };
//		int arr1[] = { 4, 6,1, 9, 8, 7, 5, 23, 10, 20 };
//
//		if (arr.length == arr1.length) {
//			System.out.println("Arrays are equal");
//
//		} else {
//			System.out.println("Arrays are not equal");
//
//		}
//9. Write a Java program to find the number of even and odd integers in a given array of integers.  

//		int arr[] = { 10, 15, 45, 89, 63, 25, 41, 20 };
//
//		int Even = 0;
//		int Odd = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				Even++;
//			}
//			if (arr[i] % 2 != 0) {
//				Odd++;
//			}
//		}
//		System.out.println("Odd elements are: "+Even);
//		System.out.println("Even elements are "+Odd);

//10.Write a Java program to get the difference between the largest and smallest values in an array of integers.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter numbers:");
//		int arr[] = new int[10];
//
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("maximum number is" + max);
//		System.out.println("minimum number is" + min);
//
//		int d=max-min;
//		System.out.println("Difference between largest number and smallest number: "+d);
//
//	}
//
//}

//Question-11WAP to sort the array?

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter elements:");
//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		System.out.println("Original array:" + Arrays.toString(arr));
//
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//
//		}
//		System.out.println("Sorted array:" + Arrays.toString(arr));
//
//	}
//}
//Question-12 WAP to find the dublicates element from an array.

//		int arr[] = { 5, 2, 6, 9, 8, 4, 2, 1, 1, 5 };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] == arr[i]) {
//					System.out.print( arr[i] + ",");
//				}
//			}
//		}
		
//Question-12 WAP to find remove all the dublicates element from an array.

		
		
		
		
		
	}

