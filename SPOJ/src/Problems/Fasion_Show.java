package Problems;
import java.util.*;
public class Fasion_Show {
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] b = new int[n];
			int[] g = new int[n];
			for(int i = 0;i<n;i++) {
				b[i] = in.nextInt();
			}
			for(int i = 0;i<n;i++) {
				g[i] = in.nextInt();
			}
			Arrays.sort(b);
			Arrays.sort(g);
			int sum = 0;
			for(int i = 0;i<n;i++) {
				sum += b[i] * g[i];
			}
			System.out.println(sum);
		}
	}

}
