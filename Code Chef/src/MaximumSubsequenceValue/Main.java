package MaximumSubsequenceValue;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long[] a = new long[(int) (n+1)];
			for(long i = 1;i<=n;i++) {
				a[(int) i] = in.nextLong();
			}
			long sum = 0, p = 0;
			for(long i = 1;i<=n;i++) {
				if(a[(int) i] >= 0) {
					p++;
					sum += a[(int) i];
				}
			}
			ArrayList<Long> list = new ArrayList<>();
			for(long i = 1;i<=p;i++) {
				if(a[(int) i] < 0) {
					list.add(i);
				}
			}
			for(long i = p+1;i<=n;i++) {
				if(a[(int) i] >= 0) {
					list.add(i);
				}
			}
			System.out.println(sum);
			System.out.println(list.size()+" ");
			for(long item : list)
				System.out.println(item+" ");
		}
	}

}
