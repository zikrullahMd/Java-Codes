package Problems;
import java.util.*;
public class GridLand_Metro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long k = in.nextLong();
		long del = 0;
		while(k-->0) {
			long x = in.nextLong();
			long c1 = in.nextLong();
			long c2 = in.nextLong();
			del += c2 - c1 + 1;
		}
		System.out.println(n * m - del);
	}

}
