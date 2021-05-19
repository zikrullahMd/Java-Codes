package AA_Problem;

import java.util.Scanner;

public class Sum_of_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] a = new long[(int)n];
		long sum = 0;
		for(long i = 0;i<n;i++) {
			a[(int)i] = in.nextLong();
			sum += a[(int)i];
		}
		long q = in.nextLong();
		while(q-->0) {
			long s = in.nextLong();
			long e = in.nextLong();
			long sumOne = 0;
			long sumTwo = 0;
			for(long i = 0;i<s;i++) {
				sumOne += a[(int)i];
			}
			for(long j = e+1;j<n;j++) {
				sumTwo += a[(int)j];
			}
			long ans = sum  - sumOne - sumTwo;
			System.out.println(ans);
		}
	}

}
