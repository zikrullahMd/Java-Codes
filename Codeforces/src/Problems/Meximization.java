package Problems;
import java.util.*;
import java.util.Map.Entry;
public class Meximization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			int[] ans = new int[n];
			Map<Integer,Integer> map = new TreeMap<>();
			for(int i = 0;i<n;i++) {
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
			}
			int f = 0;
			for(Entry<Integer,Integer> entry : map.entrySet()) {
				ans[f] = entry.getKey();
				map.put(entry.getKey(), map.get(entry.getKey())-1);
				f++;
			}
	
			for(Entry<Integer,Integer> entry : map.entrySet()) {
				if(entry.getValue() > 0) {
					int temp = entry.getValue();
					while(temp-->0) {
						ans[f] = entry.getKey();
						f++;
					}
				}
			}
			for(int i : ans) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
