package test;

import java.util.ArrayList;
import java.util.Collections;

public class AraayListQuestions {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();

//Question-1 Wap to sort an array.
		al.add(5);
		al.add(15);
		al.add(2);
		al.add(36);
		al.add(9);
		al.add(51);
		al.add(21);

//		Collections.sort(al);
//		System.out.println("sort in ascending order " + al);

//Question-2 WAP to sort in decanding order.

//		Collections.sort(al.reversed());
//		System.out.println("sort in descending order " + al);

//Question-3 Wap to reversed an aaray.

//		Collections.reverse(al);
//		System.out.println("reversed order " + al);

//Question-4 Wap to sort the string.
		
		ArrayList<String> al1=new ArrayList();
		
		al1.add("mahi");
		al1.add("is");
		al1.add("a");
		al1.add("software");
		al1.add("developer");

		Collections.sort(al1);
		System.out.println( al1);

	}

}
