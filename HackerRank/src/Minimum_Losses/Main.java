package Minimum_Losses;
import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OPTIMIZED ARRAY
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] a = new long[(int)n];
		for (long i = 0; i < a.length; i++) {
			a[(int)i] = in.nextLong();
		}
		HashMap<Long,Long> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			long e = a[i];
			map.put(e, (long) i);
		}
		Arrays.sort(a);
		long min = Integer.MAX_VALUE;
		long d = 0;
		for(int i = 0;i<n-1;i++) {
			if(a[i] < a[i+1] && map.get(a[i]) > map.get(a[i+1])) {
				min = Math.min(min, a[i+1] - a[i]);
			}
		}
		System.out.println(min);
		
	}

}
