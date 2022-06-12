package inheritence;

public class CourseTest {

	public static void main(String[] args) {
		University u1 = new University();//parent can fetch parent properties
		System.out.println("---only parent---");

		u1.engineering();
		u1.MBA();
		u1.mtech();
		
		System.out.println("---Parent,Child+overridden---");
		
		College1 c1 = new College1(); 	 //child can fetch child properties
		c1.engineering();
		c1.machineLearning();
		c1.MBA();
		c1.mtech();
		c1.worldHistory();
		
		System.out.println("---Parent+overridden---");
		
		University u2 = new College1();	 //child can fetch parent and child properties
		u2.engineering();
		u2.MBA();
		u2.mtech();

		System.out.println("***********");
		
		//College1 c2 = (College1) new University();  //parent can't fetch child properties
		
	}

}
