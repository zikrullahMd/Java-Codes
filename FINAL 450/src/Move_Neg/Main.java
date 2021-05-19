package Move_Neg;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int j = 0;
//		for(int i = 0;i<n;i++) {
//			if(a[i] < 0) {
//				if(i!=j) {
//					int t = a[i];
//					a[i] = a[j];
//					a[j] = t;
//				}
//				j++;
//			}
//		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
