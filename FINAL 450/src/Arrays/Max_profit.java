package Arrays;
import java.util.*;
public class Max_profit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int max = 0;
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j<n;j++) {
				int d = a[j] - a[i];
				max = Integer.max(max, d);
			}
		}
		System.out.println("Max "+max);
	}
}
