package test;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionArray {
	public static void main(String[] args) {

//		int arr[] = { 5, 9, 8, 10, 56, 3, 7 };
//		for (int i = 0; i < arr.length; i++) {
//			
//		System.out.println(arr[i]);
//
//		}
//		System.out.println(Arrays.toString(arr));

//*********************************************************************************		
//Question-1-WAP to find large among n numbers.
//		Scanner sc = new Scanner(System.in);
////		int n=sc.nextInt();
//		System.out.println("Enter 1st number:");
//		int large = sc.nextInt();
//
//		for (int i = 2; i <= 5; i++) {
//			int num = sc.nextInt();
//			if (num > large) {
//				large = num;
//			}
//
//		}
//		System.out.println("largest number is:" + large);

//*******************************************************************************
//Question-2 WAP to factorial?

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int a = sc.nextInt();
//
//		int m = 1;
//		for (int i = a; i > 0; i--) {
//			m = i * m;
//		}
//
//		System.out.println(m);

//********************************************************************************
//Question-3 WAP to find an element index from an array by the user.
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		System.out.println("enter an element from array:");
//		int a = sc.nextInt();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == a) {
//				System.out.println("index number of this element is" + i);
//
//			}
//					}

//********************************************************************************
//Question-4 Take 10-character input from user and count the number of special 
//		characters, numeric, capital and small Alphabets from an array. 

//		Scanner sc = new Scanner(System.in);
//		char[] arr = new char[10];
//		System.out.println("Enter 10 characters:");
//
//		// Input 10 characters into the array
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.next().charAt(0); // Reads one character at a time
//		}
//
//		// Counters
//		int capital = 0, small = 0, digit = 0, special = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			char ch = arr[i];
//			if (Character.isUpperCase(ch)) {
//				capital++;
//			} else if (Character.isLowerCase(ch)) {
//				small++;
//			} else if (Character.isDigit(ch)) {
//				digit++;
//			} else {
//				special++;
//			}
//		}
//
//		// Output results
//		System.out.println("Capital letters: " + capital);
//		System.out.println("Small letters: " + small);
//		System.out.println("Digits: " + digit);
//		System.out.println("Special characters: " + special);

//********************************************************************************
//Question-5	Find max and min from an array.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int arr[] = new int[5];
//
//		int max = 0;
//		int min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if (arr[i] > max) {
//				max = arr[i];
//			} else if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("maximum num is" + max);
//		System.out.println("manimum num is" + min);

//****************************************************************************
//Question-6 Check whether a string is anagram or not.	
//		String s1="coola";
//		String s2="coal";
//		
//		s1=s1.replace(" ", " ");
//		s2=s2.replace(" ", " ");
//		
//		s1=s1.toLowerCase();
//		s2=s2.toLowerCase();
//		
//		char a[]=s1.toCharArray();
//		char b[]=s2.toCharArray();
//		
//		Arrays.sort(a);
//		Arrays.sort(b);
//
//   boolean result=Arrays.equals(a,b);
//   
//   if(result==true) {
//	   System.out.println("String are anagram");
//   }
//   else {
//	   System.out.println("String are not anagram");
//
//   }

//Question-7 WAP to find the number is palindrome or not.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int or=a;
		int count = 0;
		while (a > 0) {
			int rem = a % 10;
			count = count * 10 + rem;
			a = a / 10;
		}
		System.out.println(count);
		if (or == count) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");

		}

	}
}
