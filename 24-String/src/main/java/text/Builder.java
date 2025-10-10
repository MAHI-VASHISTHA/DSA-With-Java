package text;

import java.util.*;

public class Builder {

	public static void main(String[] args) {

//		StringBuilder str = new StringBuilder("hello");
//		System.out.println(str);
//
//		str.setCharAt(0, 'c');
//		System.out.println(str);
//		// Append method-boolean
//		str.append(false);
//		System.out.println(str);
//
//		// Append method-String
//		str.append(" mahi");
//		System.out.println(str);
//		// Append method-int
//         str.append(10);
//         System.out.println(str);
         
		StringBuilder ss=new StringBuilder("IIMT university");
		ss.reverse();
		System.out.println(ss);
		
		ss.reverse();
		System.out.println(ss);
		
		ss.deleteCharAt(3);
		System.out.println(ss);
		
		ss.delete(1, 4);
		System.out.println(ss);

		
//         
	}

}
