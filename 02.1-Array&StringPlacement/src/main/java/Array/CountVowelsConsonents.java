package Array;

import java.util.Scanner;

public class CountVowelsConsonents {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s1=sc.nextLine();
		
		s1=s1.toUpperCase();
		int vowels=0;
		int consonent=0;
		
		for(int i=0;i<=s1.length()-1;i++) {
		char c=s1.charAt(i);
		if(c!=' ') {
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vowels++;
			}
			else {
				consonent++;
			}
		}
	}
		System.out.println(vowels);
		System.out.println(consonent);

}
}