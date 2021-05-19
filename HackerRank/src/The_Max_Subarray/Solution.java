package The_Max_Subarray;
import java.util.*;
public class Solution {
	
	//Correct
	
	static int SubArrays(int[] a) {
		int n = a.length;
		int meh = 0;
		int msf = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			meh += a[i];
			if(meh < a[i]) {
				meh = a[i];
			}
			if(msf < meh) {
				msf = meh;
			}
		}
		return msf;
	}
	
	static int SubSequence(int[] a) {
		int n = a.length;
		Arrays.sort(a);
		int meh = 0;
		int msf = Integer.MIN_VALUE;
		for(int i = n-1;i>=0;i--) {
			meh += a[i];
			if(meh < a[i]) {
				meh = a[i];
			}
			if(msf < meh) {
				msf = meh;
			}
		}
		return msf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			System.out.println(SubArrays(a)+" "+SubSequence(a));
		}
	}

}
