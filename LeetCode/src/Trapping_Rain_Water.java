import java.util.*;
public class Trapping_Rain_Water {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int[] pm = new int[n];
		int[] sm = new int[n];
		pm[0] = a[0];
		int max = a[1];
		for(int i = 1;i<n;i++) {
			// comparing between a[i] or pm[i-1]
			if(a[i] > pm[i-1]) {
				pm[i] = a[i];
			}else {
				pm[i] = pm[i-1];
			}
		}
		sm[n-1] = a[n-1];
		for(int i = n-2;i>=0;i--) {
			if(a[i] > sm[i+1]) {
				sm[i] = a[i];
			}else {
				sm[i] = sm[i+1];
			}
		}
		int ans = 0;
		for(int i = 0;i<n;i++) {
			ans += Math.min(pm[i], sm[i]) - a[i];
		}
		System.out.println(ans);
	}
}
