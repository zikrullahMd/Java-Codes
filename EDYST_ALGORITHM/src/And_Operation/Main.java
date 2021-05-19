package And_Operation;
import java.util.*;
public class Main {
	static void printArray(int[] a ) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int q = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			while(q-->0) {
				int l = in.nextInt();
				int r = in.nextInt();
				int v = in.nextInt();
				for(int i = l;i<=r;i++) {
					a[i+1] = a[i+1] & v;
				}
			}
			printArray(a);
		}
	}

}
