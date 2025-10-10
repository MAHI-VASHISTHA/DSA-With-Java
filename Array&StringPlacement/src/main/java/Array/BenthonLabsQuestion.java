package Array;
import java.util.*;
public class BenthonLabsQuestion {

	public static boolean mahi(String expr) {

		
		int count=0;
		for(int i=0;i<expr.length();i++) {
			char c=expr.charAt(i);
			if(c=='(') {
				count++;
			}
			else if(c==')') {
				count--;
				
			}
		

			if(count<0) {
				return false;
			}
		
}
		return count==0;
	}
public static void main(String[] args) {
	
	System.out.println(mahi("(a+b)"));
	System.out.println(mahi("((a+b)"));
	System.out.println(mahi("(a+b))"));
	System.out.println(mahi("(a*b)+(a+b)"));
	System.out.println(mahi("(a+b)("));
}
}