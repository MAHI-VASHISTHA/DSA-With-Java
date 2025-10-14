     package text;

public class StringMethods {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str);
		
//		to find the string length
		System.out.println(str.length());
		
//		to find the index character
		System.out.println(str.charAt(2));
		
//		index method()
        System.out.println(str.indexOf('l'));
        
//      compareTo method()-it used to compare the content of the string. 
        String s1="cello";
        String s2="wello";
        
        System.out.println(s1.compareTo(s2));
        
//        contain method
        System.out.println(s1.contains("llo"));
        System.out.println(s1.contains("llg"));
//        
        String s="physics wallah";
        System.out.println(s.startsWith("phy"));
        System.out.println(s.endsWith("llo"));
 
        System.out.println(s1.concat(s2));

        String str1="mahi vashistha";
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(0, 5));

        
	}

}
