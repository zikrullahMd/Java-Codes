package Problems;
import java.util.*;
import java.util.Map.Entry;
public class Min_Increment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int[] s = new int[a[n-1]];
		for(int i = 0;i<n;i++) {
			s[a[i]-1] = -1;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				
			}
		}
	}

}
