package Problems;
import java.util.*;
public class Non_divisible_subste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int k = in.nextInt();
		long[] a = new long[(int)n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextLong();
		}
		long[] r = new long[(int) n];
		for(int i = 0;i<n;i++) {
			r[i] = a[i] % k;
		}
		
		
	}
	

}
