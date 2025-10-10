package Array;

import java.util.Scanner;

public class Questionn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

//		int org=a;
//		int rev = 0;
//		while (a > 0) {
//			int rem = a % 10;
//			rev = rev * 10 + rem;
//			a = a / 10;
//
//		}
//		System.out.println(rev);
//
//		if (org == rev) {
//			System.out.println("yes! number is palindrome");
//		} else {
//			System.out.println("yes! number is not palindrome");
//
//		}
		int m=1;
		for(int i=a;i>0;i--) {
		m=m*a;
		}
		System.out.println(m);

	}
}