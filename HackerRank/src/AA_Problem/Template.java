package AA_Problem;
import java.util.*;
public class Template {
	
	static Scanner in = new Scanner(System.in);
	static int[] inputArray(int n) {
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		return a;
	}
	
	static int[][] input2d(int n, int m){
		int[][] a = new int[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				a[i][j] = in.nextInt();
			}
		}
		return a;
	}
	
	static void print(int a) {
		System.out.println(a);
	}
	static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	static void print2d(int[][] a) {
		for(int i = 0;i<a[0].length;i++) {
			for(int j = 0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
