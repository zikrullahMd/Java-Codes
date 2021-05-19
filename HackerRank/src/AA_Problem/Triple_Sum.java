package AA_Problem;
import java.util.*;
public class Triple_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int tar = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			boolean ans = false;
			Arrays.sort(a);
			for(int i = 0;i<n;i++) {
				int l = i+1;
				int r = a.length - 1;
				while(l<r) {
					if(a[i] + a[l] + a[r] == tar) {
						ans = true;
						break;
					}
					else if(a[i] + a[l] + a[r] < tar) {
						l++;
					}else {
						r--;
					}
				}
			}
			System.out.println(ans);
		}
	}

}
