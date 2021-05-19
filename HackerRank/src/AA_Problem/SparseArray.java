package AA_Problem;
import java.util.*;
public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] a = new String[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.next();
		}
		int m = in.nextInt();
		String[] b = new String[m];
		for(int i = 0;i<m;i++) {
			b[i] = in.next();
		}
		HashMap<String,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(int i = 0;i<m;i++) {
			System.out.println(map.getOrDefault(b[i], 0));
		}
	}

}
