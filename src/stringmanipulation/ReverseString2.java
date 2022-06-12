package stringmanipulation;

public class ReverseString2 {

	public static void main(String[] args) {

		String s = "Selenium";
		String reverse = "";
		for (int i = s.length()-1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);

	}

}
