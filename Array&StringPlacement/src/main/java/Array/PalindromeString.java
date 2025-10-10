package Array;

public class PalindromeString {

	public static void main(String[] args) {

		String str="good morning";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String str1=sb+"";
		
		System.out.println(str1);

		if(str==str1) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");

		}
	}

}
