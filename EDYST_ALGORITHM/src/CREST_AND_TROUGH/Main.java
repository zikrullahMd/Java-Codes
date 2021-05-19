package CREST_AND_TROUGH;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			long[] a = new long[(int) n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			HashMap<Long,Long> cmap = new HashMap<>();
			HashMap<Long,Long> tmap = new HashMap<>();
			for(int i = 1;i<n-1;i++) {
				if(a[i] > a[i+1] && a[i] > a[i-1]) {
					long len = (int) Math.max(Math.abs(a[i]-a[i-1]),Math.abs(a[i]-a[i+1]));
					cmap.put(len, (long) i);
				}
				else if(a[i] < a[i-1] && a[i] < a[i+1]) {
					long len = (int) Math.max(Math.abs(a[i]-a[i-1]),Math.abs(a[i]-a[i+1]));
					tmap.put(len, (long) i);
				}
			}
			System.out.println(cmap);
			System.out.println(tmap);
		}
	}

}
