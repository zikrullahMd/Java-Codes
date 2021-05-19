package No_time_to_Wait;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int h = in.nextInt();
			int x = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			String ans = "NO";
			for(int i = 0;i<n;i++) {
				if(a[i] + x == h) {
					ans = "YES";
					break;
				}
			}
			System.out.println(ans);
	}

}
