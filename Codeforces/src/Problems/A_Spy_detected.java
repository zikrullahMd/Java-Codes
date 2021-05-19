package Problems;
import java.util.*;
public class A_Spy_detected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] =in.nextInt();
			}
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0;i<n;i++) {
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
			}
			int ans = -1;
			for(int i = 0;i<n;i++) {
				if(map.get(a[i]) == 1) {
					ans = i+1;
				}
			}
			System.out.println(ans);
		}
	}

}
