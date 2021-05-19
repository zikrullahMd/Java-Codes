package Max_Contigous_Sum;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kaden's Algorithm
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
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
		System.out.println(msf);
	}

}