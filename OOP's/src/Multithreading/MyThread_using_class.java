/*
 *         	octa core means 8 cpu's.
 *         	By default we have atleas one thread running.
 * 			When we run start() method the run() method starts automatically.        
 * 			There are two ways of doing multi threading : One is extending Thread class and another one
 * 			is by Implementing Runnable interface.
 * 
 */
package Multithreading;
class A extends Thread{
	public void run() {
		for(int i = 1;i<=13;i++) {
			System.out.println("Abakhadar");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
class B extends A{
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println("ron");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
public class MyThread extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		a.start();
		Thread.sleep(10);
		b.start();
	}
	
}
