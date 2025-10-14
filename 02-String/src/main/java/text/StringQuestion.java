package text;

import java.util.*;

public class StringQuestion {
	public static void main(String[] arr) throws Exception {

//		String s = "abcd";
////	output-a ab abc abcd b bc bcd c cd d
//
//		for (int i = 0; i <= 3; i++) {
//			for (int j = i + 1; j <= 4; j++) {
//				System.out.print(s.substring(i, j) + " ");
//
//			}
//		}

		String s = "sanam teri kasam";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name:");
		String ss = sc.nextLine();

		
			if (s.equals(ss)) {
				System.out.println("matched");
			} else {
				System.out.println("try again");

			
		}
	}
}
