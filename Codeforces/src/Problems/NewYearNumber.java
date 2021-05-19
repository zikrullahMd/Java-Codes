package Problems;
import java.util.*;
public class NewYearNumber {
	
	static String solve(int n) {
		int r = n % 10;
		while(r-->0) {
			n -= 2021;
		}
		if(n == 0) {
			return "YES";
		}
		while(n > 0) {
			n -= 2020;
		}
		if(n == 0) {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			
			System.out.println(solve(n));
		}
	}

}
