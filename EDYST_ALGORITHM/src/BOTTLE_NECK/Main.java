package BOTTLE_NECK;
import java.util.*;
public class Main {
		//CORRECT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			HashMap<Long,Long> map = new HashMap<>();
			long n = in.nextLong();
			long[] a = new long[(int) n];
			for (long i = 0; i < a.length; i++) {
				a[(int) i] = in.nextLong();
			}
			for(long i = 0;i<n;i++) {
				if(map.containsKey(a[(int) i])) {
					map.put(a[(int) i], map.get(a[(int) i])+1);
				}else {
					map.put(a[(int) i], (long) 1);
				}
			}
			System.out.println(Collections.max(map.values()));
		}
	}

}
