package Problems;
import java.util.*;
public class SubArray_Division {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a =new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		for(int i = 1;i<n;i++) {
			a[i] += a[i-1];
		}
		int count = (m <= n && a[m - 1] == d) ? 1 : 0;
		for (int i = m; i < n; i++) {
            // If the sum of the piece is equal to 'd'
            if (a[i] - a[i - m] == d) {
                // Increment ways counter
                count++;
            }
        }
		System.out.println(count);
	}

}
