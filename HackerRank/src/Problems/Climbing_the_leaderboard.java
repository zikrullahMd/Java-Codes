package Problems;
import java.util.*;
import java.util.Map.Entry;
public class Climbing_the_leaderboard {
	
	public static int getIndex(Set<Integer> set, Object value) {
			
		   int result = 0;
		   for (Integer entry:set) {
		     if (entry.equals(value)) return set.size()-result;
		     result++;
		   }
		   return -1;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(in.nextInt());
		}
		int m = in.nextInt();
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			b.add(in.nextInt());
		}
		Set<Integer> set = new TreeSet<>(a);
		for(int i = 0;i<m;i++) {
			set.add(b.get(i));
			System.out.println(getIndex(set,b.get(i)));
		}
		
	}

}
