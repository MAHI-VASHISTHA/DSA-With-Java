package Array;

import java.util.Arrays;

public class Stringsort {
	public static void main(String[] args) {

		String[] s1 = { "banana", "grapes", "papaya", "apple" };

		for (int i = 0; i <= s1.length; i++) {
			Arrays.sort(s1);
		}
		System.out.println(Arrays.toString(s1));
		
		
		}
	}

