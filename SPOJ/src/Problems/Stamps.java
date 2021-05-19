package Problems;
import java.util.*;
public class Stamps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long k = 1;
		long t = in.nextLong();
		while(t-->0) {
			long r = in.nextLong();
			long n = in.nextLong();
			//Long[] a= new Long[(long)n];
			PriorityQueue<Long> a = new PriorityQueue<>(Collections.reverseOrder());
			for(long i = 0;i<n;i++) {
				long e = in.nextLong();
				a.add(e);
			}
			long sum = 0;
			long ans = 0;
			while(sum < r) {
				ans++;
				sum += a.poll();
				if(ans == n)
					break;
				
			}
			System.out.println("Scenario #"+k+":");
			if(ans == n) {
				System.out.println("impossible");
			}else {
				System.out.println(ans);
			}
			k++;
		}
	}

}