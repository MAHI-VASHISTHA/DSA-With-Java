package Array;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		float range=sc.nextInt();
	//	
		float sum=0f;
		float avg=0f;
	//	
		for(int i=1;i<=range;i++) {
			System.out.println(i);
		
			sum=i+sum;
		avg=sum/range;		}
		System.out.println("The Sum is : "+sum);
	System.out.println("The Average is : "+avg);
}}
