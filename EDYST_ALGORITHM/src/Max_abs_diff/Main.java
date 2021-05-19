package Max_abs_diff;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int max = 0;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				int sum = Math.abs(a[i]-a[j]) + Math.abs(i-j);
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
		
	}

}
