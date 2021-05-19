package Oops;

class MainClass {
	public static void main(String[] args) {
		Son s = new Son("zikrullah");
		s.run("zikrullah");
		Parent p = new Parent();
		
	}
}

class Father{
	String name;
	 public Father(String name) {
		System.out.println("this is father "+name);
	 }
	 public void run(String name) {
		 System.out.println(name + " is running");
	 }
 }
 
 class Son extends Father{
	 public Son(String name) {
		 super("zikrullah");
		 System.out.println(super.name);
		 System.out.println("this is son");
		 System.out.println(name +" ");
	 }
 }
 
 class Parent{
	private void run() {
		 System.out.println("Parend is Running and Running");
	 }
	 Parent p = new Parent();
	 
 }
 
 class child extends Parent{
	 private void wals() {
		 System.out.println("child is walking");
	 }
	 child c = new child();
 }