package Problems;
import java.util.*;
public class Next_Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int r = a[k-1];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] >= r && a[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
