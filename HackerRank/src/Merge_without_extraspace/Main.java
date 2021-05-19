package Merge_without_extraspace;
import java.util.*;
public class Main {
	
	public static void Print(int[] a) {
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n+m];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		int k = 0;
		for(int i = n;i<n+m;i++) {
			a[i] = b[k++];
		}
		Arrays.sort(a);
		System.out.println(Arrays.asList(a);
		Print(a);
		
		
	}
}