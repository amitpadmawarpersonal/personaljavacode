package stringmanipulation;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseString("selenium"));

	}

	public static String reverseString(String str) {
		int len = str.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		//System.out.println(rev);
		return rev;

	}

}
