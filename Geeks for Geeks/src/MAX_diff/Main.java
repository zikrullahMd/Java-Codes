package MAX_diff;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			//Brute force method
			//not a good choice
//			int max = -1;
//			for(int i = 0;i<n;i++) {
//				for(int j = i+1;j<n;j++) {
//					if(a[j] > a[i]) {
//						int diff = a[j] - a[i];
//						max = Math.max(diff, max);
//					}
//				}
//			}
//			System.out.println(max);
			
			//Maximum sum subarray
			/*First we store diff of adjacent element in another array
			 * then in the diff array we'll find subarray with max sum.*/
			int[] b = new int[n-1];
			int k = 0;
			for(int i = 0;i<n-1;i++) {
				b[k++] = a[i+1]-a[i];
			}
			int max = b[0];
			for(int i = 1;i<n-1;i++) {
				if(b[i-1] > 0)
					b[i] += b[i-1];
				if(max < b[i])
					max = b[i];
			}
			System.out.println(max);
		}
	}

}
