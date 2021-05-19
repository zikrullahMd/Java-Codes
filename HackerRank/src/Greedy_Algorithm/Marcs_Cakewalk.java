package Greedy_Algorithm;
import java.util.*;
public class Marcs_Cakewalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] a =new Integer[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		long ans = 0;
		for(int i = 0;i<n;i++) {
			ans += Math.pow(2, i) * a[i];
		}
		System.out.println(ans);
	}

}
