package stringmanipulation;

public class ReverseString3 {

	public static void main(String[] args) {

		String s1 = "Amit";
		String s2 = "";
		int t = s1.length();
		for (int i = t - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

}
