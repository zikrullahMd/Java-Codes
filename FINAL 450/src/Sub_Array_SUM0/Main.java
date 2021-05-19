package Sub_Array_SUM0;
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
		boolean ans = false;
		for(int i = 0;i<n;i++) {
			int sum = 0;
			for(int j = i;j<n;j++) {
				sum += a[j];
				if(sum == 0) {
					ans = true;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
