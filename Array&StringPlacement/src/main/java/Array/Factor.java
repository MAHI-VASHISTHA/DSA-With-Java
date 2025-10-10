   package Array;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		int sum=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
