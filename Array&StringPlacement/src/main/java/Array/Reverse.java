package Array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		int rev=0;
		for (int i = 0; i <= a; i++) {
			int rem = a % 10;
			rev = rev*10+rem;
			a = a / 10;

		}
		System.out.println(rev);
	}

}
