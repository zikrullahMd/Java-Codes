package Space_Array;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n+1];
			for(int i = 1;i<=n;i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int count = 0;
			for(int i = 1;i<=n;i++) {
				if(a[i] > i) {
					count++;
				}
			}
			if(count > 0) {
				System.out.println("Second");
			}else {
				int c = 0;
				for(int i = 1;i<=n;i++) {
					c += Math.abs(a[i] - i);
				}
				if(c % 2 == 0) {
					System.out.println("Second");
				}else {
					System.out.println("First");
				}
			}
		}
	}

}
