package Max_Product_Subarray;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] a = new long[(int) n];
		for (long i = 0; i < a.length; i++) {
			a[(int) i] = in.nextLong();
		}
		if(a.length == 0) {
			System.out.println(-1);
			return;
		}
		long longest = a[0];
		long maxval = a[0];
		long minval = a[0];
		for(int i = 1;i<n;i++) {
			if(a[i] < 0) {
				long t = maxval;
				maxval = minval;
				minval = t;
			}
			
			maxval = Math.max(a[i],maxval*a[i]);
			minval = Math.min(a[i], minval*a[i]);
			
			longest = Math.max(longest, maxval);
		}
		System.out.println(longest);
	}

}
