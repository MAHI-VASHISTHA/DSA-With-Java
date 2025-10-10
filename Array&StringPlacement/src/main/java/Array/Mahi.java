package Array;

import java.util.Scanner;

public class Mahi {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		
		int sumEven=0;
		int sumOdd=0;

		while(n>0) {
			int count=n%10;
			if(count%2==0) {
				sumEven=sumEven+count;
			}
			if(count%2!=0){
				sumOdd=sumOdd+count;

			}
			n=n/10;
		}
		
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
