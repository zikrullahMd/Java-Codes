package Vaccine_Distribution;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long d = in.nextLong();
			long[] a = new long[(int) n];
			for(long i = 0;i<n;i++) {
				a[(int) i] = in.nextLong();
			}
			Arrays.sort(a);
			long risk = 0;
			long nrisk = 0;
			for(long i = 0;i<n;i++) {
				if(a[(int) i] <= 9 || a[(int) i] >= 80) {
					risk++;
				}else {
					nrisk++;
				}
			}
			long days = 0;
			for(long i = 1;i<=risk;i+=d) {
				days++;
			}
			for(long i = 1;i<=nrisk;i+=d) {
				days++;
			}
			System.out.println(days);
		}
	}

}
