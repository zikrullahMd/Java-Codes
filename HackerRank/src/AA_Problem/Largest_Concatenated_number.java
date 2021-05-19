package AA_Problem;
import java.util.*;
public class Largest_Concatenated_number {
	
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
	static int reverseInt(int a) {
		StringBuilder s = new StringBuilder(Integer.toString(a));
		return Integer.parseInt(s.reverse().toString());
	}
	static int check(int a, int b) {
		return Integer.parseInt(Integer.toString(a)+Integer.toString(b));
	}
	static int checkRev(int a, int b) {
		return Integer.parseInt(Integer.toString(b)+Integer.toString(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = inputArray(n);
			String[] s = new String[n];
			for(int i = 0;i<n;i++) {
				s[i] = String.valueOf(a[i]);
			}
			Arrays.sort(s,(x,b)->(b+x).compareTo(x+b));
//			for(int i = 0;i<n-1;i++) {
//				for(int j = 0;j<n-i-1;j++) {
//					if(check(a[j],a[j+1]) < check(a[j+1],a[j])) {
//						int tem = a[j];
//						a[j] = a[j+1];
//						a[j+1] = tem;
//					}
//				}
//			}
			String ans = "";
			for(int i = 0;i<a.length;i++) {
				ans += s[i];
			}
			System.out.println(ans);
		}
	}

}
