package stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		// 012345678910
		String s = "I love java a lot";
		System.out.println(s.length());// 11
		System.out.println(s.charAt(0));// I
		System.out.println(s.charAt(s.length() - 1));// a
//		System.out.println(s.charAt(-1));//SIOBE
//		System.out.println(s.charAt(12));//SIOBE
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('a'));// first occ of a
		// System.out.println(s.indexOf('a', 9));//second occ of a
		System.out.println(s.indexOf('a', s.indexOf('a') + 1));// 10
		int s1 = (s.indexOf('a', s.indexOf('a') + 1));// storing the value of2nd occ of a in s1
		System.out.println((s1 + 1) + 1);// and using s1 to find the third occ of a

		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("lot"));
		System.out.println(s.indexOf("Amit"));

		System.out.println(s.indexOf("love"));
		if (s.indexOf("lovew") > 0) {
			System.out.println("love is present");
		} else {
			System.out.println("love is not there");
		}

		// contains - checks for a string and gives output in boolean value-true/false
		String st1 = "Archana is my best friend";
		System.out.println(st1.contains("best fri"));
		if (st1.contains("Mansi")) {
			System.out.println("Yes she is my best friend");
		} else {
			System.out.println("No, that's wrong answer");
		}

		String st2 = "welcome selenium";// string literal object creation
		String st3 = "welcome selenium";// string literal object creation
		String st4 = new String("welcome selenium");// pure object creation

		System.out.println(st2 == st3);// true
		System.out.println(st2 == st4);// false
		System.out.println(st2.equals(st4));// true

		String t = new String("Amit");
		System.out.println(t);

		String t2 = "test";
		String t3 = t2 + " new run";
		System.out.println(t2);
		System.out.println(t3);

		String r = "Java is easy";
		System.out.println(r);
		String r1 = "Yes " + r;
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r);

		// trim - removes spaces from the corners
		String y = " This is trim function ";
		System.out.println(y.trim());
		String g = "test ";
		System.out.println(g.trim());

		// replace - replaces a char with new one
		String u = "This is replace function";
		System.out.println(u.replace(" ", "_"));
		String e = "10/03/1988";
		System.out.println(e.replace("/", "."));
		String w = "192.12.12.23";
		System.out.println(w.replace(".", ","));

		// lower/upper case
		String h = "this is lower caseT";
		System.out.println(h.toUpperCase());
		String j = "THIS IS UPPER CASEr";
		System.out.println(j.toLowerCase());

		// split - splits the
		String lang = "java_python_ruby_php";
		String sr[] = lang.split("_");
		for (int i = 0; i <= 3; i++) {
			System.out.println(sr[i]);
		}

		String gh = "Split using for loop test";
		String tr[] = gh.split(" ");
//		for(int p=0;p<=4;p++) {
//			System.out.println(tr[p]);
//		}
		for (String sss : tr) {
			System.out.println(sss);
		}

		String loop = "xXtestingxXxXXSeleniumXXxXPythonxxXJava";
		String[] lp = loop.split("xX");
		System.out.println(lp[0]);
		System.out.println(lp[1]);
		System.out.println(lp[2]);
		System.out.println(lp[3]);
		System.out.println(lp[4]);

		for (String mm : lp) {
			System.out.println(mm);
		}

		for (String ttt : lp) {
			System.out.println(ttt);
		}

		String str9 = "Ashish";
		String str10 = str9 + "QA";
		System.out.println(str9);
		System.out.println(str10);
		

	}

}
