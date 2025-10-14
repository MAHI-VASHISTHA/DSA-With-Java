package text;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		
		String s=sb+"";
		System.out.println(s);

		
		String rv=sb.reverse()+"";
		System.out.println(rv);
	}

}
