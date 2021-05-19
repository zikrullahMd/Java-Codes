package SOrt_0_1_2;
import java.util.*;
public class main {

	public static void main(String[] args) {
		//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			int c0 = 0,c1=0,c2=0;
			for(int i = 0;i<n;i++) {
				if(a[i] == 0)
					c0++;
				if(a[i] == 1)
					c1++;
				if(a[i] == 2)
					c2++;
			}
			int c = 0;
			int[] b = new int[n];
			for(int i = 0;i<c0;i++) {
				b[c++] = 0;
			}
			for(int i = 0;i<c1;i++) {
				b[c++] = 1;
			}
			for(int i = 0;i<c2;i++) {
				b[c++] = 2;
			}
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i]+" ");
			}
			
		}
		
	}

}
