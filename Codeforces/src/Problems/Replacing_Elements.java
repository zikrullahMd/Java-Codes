package Problems;
import java.util.*;
public class Replacing_Elements {
	static String solve(int[] a, int n, int req) {
		Arrays.sort(a);
		for(int i = 0;i<n;i++) {
			if(a[i] > req) {
				for(int j = 0;j<n;j++) {
					for(int k = 0;k<n;k++) {
						if(j != k && a[j] + a[k] <= req) {
							a[i] = a[j] + a[k];
						}
					}
				}
			}
		}
		Arrays.sort(a);
		if(a[n-1] <= req) {
			return "Yes";
		}
		return "No";
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			System.out.println(solve(a,n,k));
		}
	}

}
