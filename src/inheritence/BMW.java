package inheritence;

	public class BMW extends Car {
		
		@Override
		public void start() {
			System.out.println("BMW--start method");
		}
		
		public void sunRoof() {
			System.out.println("BMW--sun roof method");
		}
		
		public void sharkFinnAntenna() {
			System.out.println("BMW--antenna method");
		}
		
		public void stop() {
			System.out.println("BMW--stop method");
		}

	}
	
