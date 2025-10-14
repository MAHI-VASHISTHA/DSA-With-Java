package text;

public class CompressedString {
public static void main(String[] args) {
	
	String str="aaabbbccddeef";
	String ans=""+str.charAt(0);
	
	int count=1;
	for(int i=1;i<str.length();i++) {
		char current=str.charAt(i);
		char previous=str.charAt(i-1);
		
		if(current==previous) {
			count++;

		}else {
			ans=ans+count;
			count=1;
			ans=ans+current;
		}
	}
	ans=ans+count;
	System.out.println(ans);
}
}
