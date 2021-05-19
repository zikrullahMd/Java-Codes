package SherlockAndArray;
import java.util.*;
public class Solution {
	
	static long LeftSum(long[] a, long end) {
		long sum = 0;
		for (long i = 0; i <= end; i++) {
			sum += a[(int) i];
		}
		return sum;
	}
	
	static long RightSum(long start, long[] a, long n) {
		long sum = 0;
		for(long i = start;i<n;i++) {
			sum += a[(int) i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		while(k-->0) {
			long n = in.nextLong();
			long[] a = new long[(int) n];
			for (long i = 0; i < a.length; i++) {
				a[(int) i] = in.nextLong();
			}
			long sum = 0;
			for(long i = 0;i<n;i++) {
				sum += a[(int) i];
			}
			String ans = "phir se galat hai bhai";
//			METHOD 1
//			long t = 0;
//			for(long i = 0;i<n;i++) {
//				t++;
//				long lsum = LeftSum(a,i);
//				long rsum = RightSum(i,a,n);
//				if(lsum == rsum) {
//					ans = "YES";
//					break;
//				}
//			}
//			if(t==n)
//				ans = "NO";
//			METHOD 2 (ACCEPTED)
			int j = 0;
			int t = 0;
			for(int i = 0;i<n;i++) {
				long r =  (sum - a[i]);
				if(2 * j == r) {
					ans = "YES";
					break;
				}
				t++;
				j += a[i];
			}
			if(t == n) {
				ans = "NO";
			}
			System.out.println(ans);
		}
	}

}
