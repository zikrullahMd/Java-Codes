package Problems;
import java.util.*;
public class Expressions {
	
	
	static int get1(int a, int b, int c) {
		return a + (b*c);
	}
	static int get2(int a, int b, int c) {
		return a * (b + c);
	}
	static int get3(int a, int b, int c) {
		return a * b * c;
	}
	static int get4(int a, int b, int c) {	
		return (a+b) * c;
	}
	
	static int get5(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max1 = Math.max(get1(a,b,c), get2(a,b,c));
		int max2 = Math.max(get3(a,b,c), get4(a,b,c));
		int max = Math.max(max1, max2);
		System.out.println(Math.max(max, get5(a,b,c)));
	}

}
