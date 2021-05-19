package Chef_and_easy_Queries;
import java.util.*;
import java.util.Map;
class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long k = in.nextLong();
			long[] a = new long[(int) (n+1)];
			for (long i = 1; i <=n; i++) {
				a[(int) i] = in.nextLong();
			}
			long sum = 0;
			long day = 0;
			long carry = 0;
			
			for(long i = 1;i<=n;i++) {
				day++;
				sum = a[(int) i] + carry;
				carry = sum - k;
				if(sum < k) {
					break;
				}
			}
			if(sum < k) {
				System.out.println(day);
			}else {
				day += (long) (sum - k) / k+1;
				System.out.println(day);
			}
		}
	}

}