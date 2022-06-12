package stringmanipulation;

public class ReverseString4 {

	public static void main(String[] args) {
		
		String s1 = "This is JAVA";
		String s2 = "";
		int i = s1.length();
		for(int j = i-1;j>=0;j--) {
			s2 = s2+s1.charAt(j);
		}
		System.out.println(s2);
	}

}
