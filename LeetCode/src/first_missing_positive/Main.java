package first_missing_positive;
import java.util.*;
public class Main {
	
	public static int firstMissing(int[] a, int n) {
		for(int i = 0;i<n;i++) {
			int currPos = a[i] - 1;
			while(a[i] >= 1 && a[i] <= n && a[i]  != a[currPos]) {
				int temp = a[i];
				a[i] = a[currPos];
				a[currPos] = temp;
				currPos = a[i] - 1;
			}
		}
		int ans = 0;
		for(int i = 0;i<n;i++) {
			if(a[i] != i+1) {
				ans = i+1;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		System.out.println(firstMissing(a,n));
	}

}
