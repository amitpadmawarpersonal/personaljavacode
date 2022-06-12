package stringmanipulation;

public class ReverseString6 {

	public static void main(String[] args) {

		reverseString("This is java");
	}

	public static void reverseString(String str) {
		int len = str.length();
		String reverse = "";

		for (int i = len - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
			

		}
		System.out.println(reverse);
		// return reverse;

	}

}
