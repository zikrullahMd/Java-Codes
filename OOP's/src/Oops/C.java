package Oops;

interface A {
	default void print() {
		System.out.println("A is showing");
	}
}

interface B{
	default void print() {
		System.out.println("B is showing");
	}
}

class C implements A,B{
	public void print() {
		A.super.print();
		B.super.print();
	}
	public static void main(String[] args) {
		C c = new C();
		c.print();
	}
}
