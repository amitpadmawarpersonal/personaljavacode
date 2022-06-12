package wrapperclass;

public class ParseInt {

	public static void main(String[] args) {

		// Without wrapper
		String s = "100A";
		System.out.println(s + 300);

		// With wrapper
		int s2 = Integer.parseInt(s);
		System.out.println(s2 + 300);

		String str = "3443";
		String str3 = "3443" + "454";
		System.out.println(str3);
		int str2 = Integer.parseInt(str);
		System.out.println(str2 + 34);

	}

}
