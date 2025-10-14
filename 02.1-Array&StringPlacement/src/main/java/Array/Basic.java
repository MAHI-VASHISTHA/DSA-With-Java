package Array;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int a = sc.nextInt();

//		int num=0;
//		while(a>0) {
//			a=a/10;
//			num++;
//		}
//		System.out.println(num);

		int sumOdd = 0;

		while (a > 0) {
			int count = a % 10;
			if (count % 2 != 0) {
				sumOdd = sumOdd+count;
			}
			a = a / 10;
		}
		System.out.println(sumOdd);
	}
}