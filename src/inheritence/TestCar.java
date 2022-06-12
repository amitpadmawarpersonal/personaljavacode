package inheritence;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.fourWheel();
		c1.start();
		c1.stop();
	System.out.println("**********");
		BMW b1 = new BMW();
		b1.fourWheel();
		b1.sharkFinnAntenna();
		b1.start();
		b1.stop();
		b1.sunRoof();
		
		Car c2 = new BMW();
		c2.fourWheel();
		c2.start();
		c2.stop();
}

}
