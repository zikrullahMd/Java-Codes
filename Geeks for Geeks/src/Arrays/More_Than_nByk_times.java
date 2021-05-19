package Arrays;
import java.util.*;
import java.util.Map.Entry;
public class More_Than_nByk_times {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Set<Integer> list = new HashSet<>();
		//Noob Aproach
//		int ans = 0;
//		for(int i = 0;i<n;i++) {
//			int count = 0;
//			for(int j = 0;j<n;j++) {
//				if(a[j] == a[i]) {
//					count++;
//				}
//			}
//			if(count > n/k) {
//				list.add(a[i]);
//			}
//		}
//		System.out.println(list);
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int i = 0;i<n;i++) {
//			if(map.containsKey(a[i])) {
//				map.put(a[i], map.get(a[i])+1);
//			}else {
//				map.put(a[i], 1);
//			}
//		}
//		for(Entry<Integer,Integer> entry : map.entrySet()) {
//			if(entry.getValue()>n/k) {
//				list.add(entry.getKey());
//			}
//		}
//		System.out.println(list);
		Arrays.sort(a);
		System.out.println(a[a.length/2]);
	}
}
