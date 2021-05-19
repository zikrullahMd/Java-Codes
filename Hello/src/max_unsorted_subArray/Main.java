package max_unsorted_subArray;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int si =0;
		int ei = n-1;
		for(int i = 0;i<n;i++) {
			if(i+1 < n && a[i] > a[i+1]) {
				si = i;
				break;
			}
		}
		for(int i = n-1;i>=0;i--) {
			if(i-1 >= 0 && a[i] < a[i-1]) {
				ei = i;
				break;
			}
		}
		if(si == 0) {
			System.out.println(-1);
			return;
		}
		Arrays.sort(a,si,ei+1);;
		int[] temp = Arrays.copyOf(a, n);
		Arrays.sort(temp);
		if(Arrays.equals(a,temp)) {
			System.out.println(si+" "+ei+1);
			return;
		}
			//System.out.println("before "+"si "+si+" "+"ei "+ei);
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			
			for(int i = si+1;i<=ei+1 && i<n;i++) {

				if(a[i] > max)
					max = a[i];
				if(a[i] < min)
					min = a[i];
			}
			//System.out.println("min "+min+" "+"max "+max);
			for(int i = 0;i<si;i++) {
				if(a[i] > min) {
					si = i;
					break;
				}
			}

			for(int i = n-1;i>=ei+1;i--) {
				if(a[i] < max) {
					ei = i;
					break;
				}
			}
			
			System.out.println(si+" "+ei);
	}

}
