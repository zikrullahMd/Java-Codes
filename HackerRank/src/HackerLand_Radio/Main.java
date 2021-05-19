package HackerLand_Radio;
import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int c = 0;
		Arrays.sort(a);
		int i = 0;
		while(i<n) {
			c++;
			int loc = a[i] + r;
			while(i<n && a[i] <= loc) {
				i++;
			}
			loc = a[--i] + r;
			while(i<n && a[i] <=loc) {
				i++;
			}
		}
		System.out.println(c);
	}

}
