package inheritence;

public class Car {

	public void start() {
		System.out.println("Car--start method");
	}

	public void stop() {
		System.out.println("Car--stop method");

	}

	public void fourWheel() {
		System.out.println("Car--four wheel method");

	}
		public static void main(String[] args) {
			Car c = new Car();
			c.fourWheel();
		}
	
}

//create grandparent vehicle and try to access methods across classes
//create a truck as a parent of BMW class and try to access methods across
//Create sibling of BMW under car and access properties
//create static method in parent and try to override and overload it in child and call across
//Create private method in car and access it across
//Create variables in Car class and try to override, inherit and access it across
//Create method with final keyword and try to override and access it diff classes
//Make parent class a Final and see what happens
//Create static final variables and try to access it in diff classes