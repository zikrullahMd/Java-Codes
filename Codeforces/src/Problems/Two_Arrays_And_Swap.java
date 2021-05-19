package Problems;
import java.util.*;
public class Two_Arrays_And_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0;i<n;i++) {
				b[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int i = 0;
			int j = n-1;
			while(k-->0) {
				if(a[i] >= b[j]) {
					break;
				}
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				i++;
				j--;
			}
			int sum = 0;
			for(int f = 0;f<n;f++) {
				sum += a[f];
			}
			System.out.println(sum);
		}
	}

}
