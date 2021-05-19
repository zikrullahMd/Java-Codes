package AA_Problem;
import java.util.*;
public class Sort_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int low = 1;
		int mid = 1;
		int high = n;
		int i = 0;
		while(i<n && mid <high) {
			if(a[i] == 0) {
				int t = a[low];
				a[low] = a[i];
				a[i] = t;
				low++;
				mid++;
			}else if(a[i] == 1) {
				mid++;
			}else {
				int t = a[high];
				a[high] = a[i];
				a[i] = t;
				high--;
				i--;
			}
		}
		for(int f = 0;f<n;f++) {
			System.out.print(a[f]+" ");
		}
	}
}