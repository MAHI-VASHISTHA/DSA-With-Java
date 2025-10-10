  package text;

import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder(sc.nextLine());
		
		String st=s+"";
		String str=s.reverse()+"";
		
		if(st.equals(str)) {
			System.out.println("String is palindrone");
		}
		else {

			System.out.println("String is not palindrone");
		
		}
	}

}
