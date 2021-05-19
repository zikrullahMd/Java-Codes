package Greedy_Algorithm;
import java.util.*;
public class Grid_Challenge {
	
	static String Sort(String s) {
		char[] t = s.toCharArray();
		Arrays.sort(t);
		return new String(t);
	}
	
	static String isSorted(String[] a, int n) {
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j<n-1;j++) {
				if(a[i].charAt(j) > a[i+1].charAt(j+1)) {
					return "NO";
				}
			}
		}
		return "YES";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			String[] a = new String[n];
			for(int i = 0;i<n;i++) {
				a[i] = Sort(in.next());
			}
			String ans = isSorted(a,n-1);
			System.out.println(ans);
		}
	}
}
