package Arrays;
import java.util.*;
public class Max_Inc_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		if(n == 1) {
			System.out.println(1);
			return;
		}
		int l = 1;
		int max = Integer.MIN_VALUE;
		for(int i = 1;i<n;i++) {
			if(a[i-1] <= a[i]) {
				l++;
			}else {
				l = 1;
			}
			max = Integer.max(max, l);
		}
		System.out.println(max);
		
	}

}
