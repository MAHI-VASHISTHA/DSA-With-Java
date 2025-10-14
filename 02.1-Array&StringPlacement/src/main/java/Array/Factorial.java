package Array;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		int m=1;
		for (int i = a; i >0; i--) {
        m=m*i;
		}
		System.out.println(m);
	}

}
