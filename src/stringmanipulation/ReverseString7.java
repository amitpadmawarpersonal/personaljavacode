package stringmanipulation;

public class ReverseString7 {

	public static void main(String[] args) {

		System.out.println(reverseString("Amit"));
		System.out.println(reverseString("m"));
		System.out.println(reverseString("lol"));
		System.out.println(reverseString(null));
		System.out.println(reverseString("1"));
		System.out.println(isPallindromString("malayalam"));// Pallandrom string
		System.out.println(isPallindromString("madam"));
		System.out.println(isPallindromString("refer"));
		System.out.println(isPallindromString("level"));

	}

	public static boolean isPallindromString(String str) {
		if (str.equals(reverseString(str))) {
			return true;
		} else {
			return false;
		}

	}

	public static String reverseString(String str) {

		if (str == null) {
			System.out.println("Not a valid string: " + str);
			return null;

		}
		int len = str.length();
		if (len == 1) {
			return str;
		}

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;

	}

}
