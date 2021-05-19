import java.util.*;
import java.util.Comparator;
public class Merge_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Intervals interval;
		int n = in.nextInt();
		Intervals[] a = new Intervals[n];
		for(int i = 0;i<n;i++) {
			int s = in.nextInt();
			int e = in.nextInt();
			a[i] = new Intervals(s,e);
		}
		Arrays.sort(a,new Comparator<Intervals>() {
			public int compare(Intervals s, Intervals e) {
				return s.s - e.e;
			}
		});
		
	}
	
	

}

class Sort implements Comparator{
	public int compare(Intervals a, Intervals b) {
		return a.s - a.e;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Intervals{
	int s;
	int e;
	public Intervals(int s, int e) {
		this.s = s;
		this.e = e;
	}
}
