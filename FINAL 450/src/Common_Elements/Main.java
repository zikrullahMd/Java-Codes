package Common_Elements;
import java.util.*;
public class Main {
	
	static boolean Contains(int[] a, int l, int r, int k) {
		if(r>=l) {
			int mid = l + (r-l)/2;
			if(a[mid] == k) {
				return true;
			}
			if(a[mid] > k) {
				return Contains(a,l,mid-1,k);
			}
			if(a[mid] < k){
				return Contains(a,mid+1,r,k);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int o = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[o];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		for (int i = 0; i < o; i++) {
			c[i] = in.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			if(Contains(b,0,m-1,a[i]) && Contains(c,0,o-1,a[i])) {
				if(!list.contains(a[i])) {
					list.add(a[i]);
				}
			}
		}
		for(int i : list) {
			System.out.print(i+" ");
		}
	}

}
