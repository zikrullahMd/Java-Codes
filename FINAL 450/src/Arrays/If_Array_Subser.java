package A_Problems;
import java.util.*;
public class If_Array_Subser {
	
	static int Contains(int[] a, int k) {
		int l = 0;
		int r = a.length - 1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			if(a[mid] == k)
				return mid;
			if(a[mid] < k) {
				l = mid + 1;
			}
			else
				r = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0;i<m;i++) {
				b[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			String ans = "YES";
			for(int i = 0;i<m;i++) {
				if(Contains(a,b[i]) < 0) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		
	}

}
