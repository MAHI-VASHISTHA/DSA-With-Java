package text;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";

		s1=s1.replace("", "");
		s2=s2.replace("", "");

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s1.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

	Boolean result = Arrays.equals(a, b);

		if (result==true) {
			System.out.println("String are anagram");
		} 
		else 
		{
			System.out.println("String are not anagram");

		}
	}
}
