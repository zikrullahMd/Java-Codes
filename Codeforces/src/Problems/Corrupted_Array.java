package Problems;
import java.util.*;
public class Corrupted_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long[] b = new long[(int)n+2];
			long sum = 0;
			for(long i = 0;i<b.length;i++) {
				b[(int)i] = in.nextLong();
				
			}
			Arrays.sort(b);
			for(long i = 0;i<n;i++) {
				sum += b[(int)i];
			}
			if(sum == b[(int)n]) {
				for(long i = 0;i<n;i++) {
					System.out.print(b[(int)i]+" ");
				}
				System.out.println();
				continue;				
			}
			sum += b[(int)n];
			long pos = -1;
			for(long i = 0;i<n+1;i++) {
				if(sum - b[(int)i] == b[(int)n+1]) {
					pos = 1;
					b[(int)i] = -1;
					break;
				}
			}
			if(pos == -1) {
				System.out.println("-1");
			}else {
				for(long i = 0;i<n+1;i++) {
					if(b[(int)i] != -1) {
						System.out.print(b[(int)i]+" ");
					}
				}
			}
			System.out.println();
		}
	}

}
