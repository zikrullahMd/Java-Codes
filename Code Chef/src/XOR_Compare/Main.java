package XOR_Compare;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long x = in.nextLong();
			long y = in.nextLong();
			long n = in.nextLong();
			long count = 0;
			for(long i = 0;i<=n;i++) {
				if((x^i)<(y^i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}