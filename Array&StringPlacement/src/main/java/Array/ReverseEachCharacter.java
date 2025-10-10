package Array;

public class ReverseEachCharacter {

	public static void main(String[] args) {

		String str="My Name Is Mahi Vashistha";
		StringBuilder sb=new StringBuilder("");
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				sb.append(ch);
			}
			else {
				sb.reverse();
				str1+=sb;
				str1+=" ";
				sb=new StringBuilder("");
				
			}
		}
		sb.reverse();
		str1+=sb;
		System.out.println(str1);

	}

}
