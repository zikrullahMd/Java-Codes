package Problems;
import java.util.*;
public class Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long[] a = new long[(int)n];
        for(long i = 0;i<n;i++) {
            a[(int)i] = in.nextLong();
        }
        long[] prefix = new long[(int)n];
        prefix[0] = a[0];
        for(int i = 1;i<n;i++) {
        	prefix[i] = a[i] + prefix[i-1] ;
        }
        long q = in.nextLong();
        while(q-->0) {
            long s = in.nextLong();
            long e = in.nextLong();
            long ans = -1;
            if(s >= 1)
            	ans = prefix[(int) e] - prefix[(int) s - 1];
            else
            	ans = prefix[(int)e];
            System.out.println(ans);
        }
	}

}
