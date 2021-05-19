package Fibonacci_Series;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int f = 0;
			int s = 1;
			if(n <= 1) {
				System.out.println(n);
			}
			else {
				System.out.print(f+" ");
				System.out.print(s+" ");
				for(int i = 2;i<=n;i++) {
					int sum = f + s;
					f = s;
					s = sum;
					System.out.print(" "+sum);
					
				}
				System.out.println();
			}
		}
	}

}
