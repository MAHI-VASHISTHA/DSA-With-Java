package text;

import java.util.Arrays;
import java.util.Scanner;

public class LongestWordInString {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String arr[]=new String[5];
//	String[] arr={"mahi","ansh","shweta","priyanka"};
    String s=""; 
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextLine();
		if(arr[i].length()>s.length()){
			s=arr[i];
		}
	}
	
	System.out.println(s);
}
}
