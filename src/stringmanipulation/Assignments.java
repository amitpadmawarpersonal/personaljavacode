package stringmanipulation;

public class Assignments {

	public static void main(String[] args) {
		// 1. Write a program to check two different strings equality.

		String s1 = "This is one";
		String s2 = "This is One";
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both the strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		//2. Remove all  spaces in a String
		String s3 = "   Hello   Everyone ";
		System.out.println(s3.replace(" ", ""));//replaces all the spaces
		//System.out.println(s3.trim());//replaces corner spaces
		
		//3. Write a program that will print out the last character 
		//and first character of a word
		
		String s4 = "I love javA";
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(s4.length()-1));
		
		//7.Write a program to get the 3rd  “ e “ of the string
		
		String s5 = "Welcome to Naveen Automation Labs!";
		System.out.println(s5.indexOf('e'));
		System.out.println(s5.indexOf('e', 2));
		int i = s5.indexOf('e', 2);
		System.out.println(i+1);
		
		
	}

}
