package A_Problems;
import java.util.*;
import java.util.Map.Entry;
public class n_by_k_TIMES {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			int  t = in.nextInt();
			if(map.containsKey(t)) {
				map.put(t, map.get(t)+1);
			}else {
				map.put(t, 1);
			}
		}
		
		int r = n/k;
		System.out.println(map);
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > r) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
