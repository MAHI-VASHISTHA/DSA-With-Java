package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {

//		1.take 10 no. from user and find maximum number.

//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter 10 numbers: ");
//		int[] arr=new int[10];
//		
//		int temp=0;
//		
//		for(int i=0;i<=arr.length-1;i++) {
//           arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<=arr.length-1;i++) {
//			if(temp<arr[i]) {
//				temp=arr[i];
//			}
//		}
//		System.out.println("Maximum number is : "+temp);

//		2.take 10 no. from user and find minimum number.

//		int min=Integer.MAX_VALUE;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter numbers: ");
//		int arr[]=new int[10];
//		
//		for(int i=0;i<=arr.length-1;i++) {
//			arr[i]=sc.nextInt();
//			}
//		
//		for(int i=0;i<=arr.length-1;i++) {
//          if(min>arr[i]) {
//			min=arr[i];
//		}
//		}
//		System.out.println("Minimum number is : "+min);

//		3.take 10 no. from user and take a number to search from array and find the index of that number.(linear search).

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter numbers");
//		int arr[] = new int[5];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		System.out.println("enter a number again");
//		int a = sc.nextInt();
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (a == arr[i]) {
//				System.out.println("Index number of that number is: "+i);
//			}
//					}
// 4.copy one array's elements to another array.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//		int arr[] = { 10, 20, 30, 40, 50 };
//		int arr1[] = new int[5];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			arr1[i] = arr[i];
//
//		}
//		System.out.println("Original array");
//
//		System.out.println(Arrays.toString(arr1));
//		System.out.println("copy array");
//
//		System.out.print(Arrays.toString(arr1));

//		5.copy one array's elements to another array in reverse order.
				Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		int arr1[]=new int[5];
		
//		for(int i=0;i>arr.length;i++) {
//			arr1[i]=arr[arr.length-1-i];
//			}
		for(int i=0;i<=arr.length-1;i++) {
			arr1[i]=arr[arr.length-1-i];
		}
		
		System.out.println("Original array");
		System.out.println(Arrays.toString(arr));
	
	System.out.println("Reversed array");
		System.out.println(Arrays.toString(arr1));

		
//6.Write a Java program to find the common elements between two arrays of integers. 
		
//		int arr[]= {10,20,30,40,50};
//		int arr1[]= {11,60,40,44,30};
//
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<=arr.length-1;j++) {
//				if(arr1[j]==arr[i]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
//7.Write a Java program to find the second largest element in an array.  
//8.Write a Java program to test the equality of two arrays. 
		
//		int arr[]= {10,20,30,40,50};
//		int arr1[]= {10,20,30,40,50};
//
//				if(arr1==arr) {
//					System.out.println("yes arrays are equal");
//				}
//				else {
//					System.out.println("yes arrays are not equal");
//
//				}
//				
//			}
//		
//}
//		9. Write a Java program to find the number of even and odd integers in a given array of integers. 
		
//		int arr[]= {10,45,96,32,1,18};
//		
//		int odd=0;
//		int even=0;
//		
//		for(int i=0;i<arr.length-1;i++) {
//		if(arr[i]%2==0) {
//			even++;
//		}
//		if(arr[i]%2!=0) {
//			odd++;
//		}
//		
//		}
//		
//		System.out.println("Number of odd number is: "+odd);
//		System.out.println("Number of even number is: "+even);
//
//10.Write a Java program to get the difference between the largest and smallest values in an array of integers.
		
//		int min=Integer.MAX_VALUE;
//		int max=Integer.MIN_VALUE;
//		
//		int arr[]= {10,20,30,40,55};
//		for(int i=0;i<=arr.length-1;i++) {
//			if(max<arr[i]) {
//			max=arr[i];	
//			}
//			if(min>arr[i]) {
//				
//				min=arr[i];
//			}
//			
//		}
//
//		System.out.println(min);
//		System.out.println(max);
//		
//		System.out.println("Difference between greatest number and lowest number is ");
//		int m=max-min;
//		System.out.println(m);
//
	}}
