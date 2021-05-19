package Oops;

public class Abstraction {
	
	public static void main(String[] args) {
		Audi a = new Audi();
		BMW b = new BMW();
		a.run();
		b.run();
	}
}
	
	
	class Audi extends Car{

		@Override
		public void run() {
			System.out.println("Audi is running");
		}
		
	}
	
	class BMW extends Car{
		public void run() {
			System.out.println("BMW is running");
		}
	}
	

	abstract class Car{
		String price;
		public abstract void run();
	}
	
	
	

