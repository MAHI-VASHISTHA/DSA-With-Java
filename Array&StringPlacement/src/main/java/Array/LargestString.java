package Array;

public class LargestString {

	public static void main(String[] args) {

		String s1[]= {"apple","bananaa","papaya","papaya"};
		 String largest=s1[0];
		 
		 for(int i=1;i<=s1.length-1;i++) {
			 if(largest.length()<s1[i].length()) {
				largest= s1[i];
			 }
		 }
		 System.out.println(largest);
	}

}
  