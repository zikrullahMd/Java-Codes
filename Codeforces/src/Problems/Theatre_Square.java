package Problems;
import java.util.*;
public class Theatre_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long n = in.nextLong();
		long x;
		long y;
		if(a % n == 0 && b % n == 0) {
			x = a/n;
			y = b/n;
		}else if(a % n != 0 && b % n == 0) {
			x = a/n + 1;
			y = b/n;
		}else if(a % n == 0 && b % n != 0) {
			x = a/n;
			y = b/n + 1;
		}else {
			x = a/n + 1;
			y = b/n + 1;
		}
		System.out.println(x * y);
	}

}
