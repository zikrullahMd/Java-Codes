package AA_Problem;
import java.util.*;
public class Max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long k = in.nextLong();
			long[] a = new long[(int)n];
			for(long i = 0;i<n;i++) {
				a[(int)i] = in.nextLong();
			}
			long meh = 0;
			long msf = Integer.MIN_VALUE;
			for(long i = 0;i<n;i++) {
				meh += a[(int)i];
				if(meh < a[(int)i]) {
					meh = a[(int)i];
				}
				if(msf < meh) {
					msf = meh;
				}
			}
			System.out.println(msf);
		}
	}

}
