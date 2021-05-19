package merge_overlapping_Intervals;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Interval> a = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			a.add(new Interval(in.nextInt(),in.nextInt()));
		}
		ArrayList<Interval> ans = new ArrayList<>();
		Collections.sort(a, (a1, b) -> Integer.compare(a1.start, b.start));
		for(int i = 0;i<a.size()-1;i++) {
			Interval one = a.get(i);
			Interval two = a.get(i+1);
			if(one.end < two.start) {
				ans.add(one);
			}else {
				one.start = Math.min(one.start, two.start);
				one.end = Math.max(one.end, two.end);
				a.remove(two);
				i--;
			}
		}
		ans.add(a.get(a.size()-1));
		for(Interval e : ans) {
			System.out.println(e.start+" "+e.end);
		}
	}
}


class Interval{
	int start, end;
	public Interval(int s, int e) {
		start = s;
		end = e;
	}
	
}