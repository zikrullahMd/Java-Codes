package Multithreading;

class one implements Runnable{
	public void run(){
		System.out.println("first");
	}
}

class two implements Runnable{
	public void run() {
		System.out.println("Second");
	}
}

public class MultiThreadingUsing_Interface {
	one o = new one();
	two t = new two();
	
	Runnable t1 = new Thread(o);
	Runnable t2 = new Thread(t);
	
	t1.start();
}
