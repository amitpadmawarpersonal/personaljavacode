package stringmanipulation;

public class ReverseString5 {

	public static void main(String[] args) {
		
		String s = "avaJ evol I";
		String s1 = "";
		int t = s.length();
		
		for(int i=t-1;i>=0;i--) {
			
			s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
