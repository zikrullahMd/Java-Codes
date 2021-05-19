package Max_SubArray_Sum_Modulo;
import java.util.*;
public class Solution {
	
	static int sum(int[] a, int n) {
		if(n <= 0)
			return 0;
		return (sum(a,n-1) + a[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int meh = 0;
		int msf = Integer.MIN_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		
	}

}
