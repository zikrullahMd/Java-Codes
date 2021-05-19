package AA_Problem;
import java.util.*;
public class Fraudulent_Activity_Notification {
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static int median(int i,int[] a, int d) {
		int[] b = new int[d];
		int j = 0;
		i--;
		while(d-->0) {
			b[j] = a[i];
			j++;
			i--;
		}
		Arrays.sort(b);
		if(d % 2 == 0) {
			int avg = a[b.length/2] + a[b.length+1] / 2;
			return avg;
		}
		return b[b.length/2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int ans = 0;
		if(n <= d) {
			System.out.println(ans);
			return;
		}
		for(int i = d+1;i<n;i++) {
			if(2*median(i,a,d) >= a[i]) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}

}
