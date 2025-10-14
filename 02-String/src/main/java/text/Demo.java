package text;

public class Demo {

	public static void main(String[] args) {

		String s1 = "ducat";
		String s2 = "ducat";
		String s3 = new String("ducat");
		String s4 = new String("ducat");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		s1="mahi";
		System.out.println(s2.hashCode());

	}

}
