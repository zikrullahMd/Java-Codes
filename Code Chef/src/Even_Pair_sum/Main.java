package Even_Pair_sum;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long l = in.nextLong();
			long r = in.nextLong();
			long e1 = 0;
			long o1 = 0;
			long e2 = 0;
			long o2 = 0;
			long ans = 0;
			if(l % 2 == 0 && r % 2 == 0) {
				e1 = l/2;
				o1 = l/2;
				e2 = r/2;
				o2 = r/2;
			}else if(l % 2 == 1 && r % 2 == 0) {
				e1 = l/2;
				o1 = e1 + 1;
				e2 = r/2;
				o2 = r/2;
			}
			else if( r % 2 == 1 && l % 2 == 0) {
				e2 = r/2;
				o2 = e2 + 1;
				e1 = l/2;
				o1 = l/2;
			} else {
				e1 = l/2;
				o1 = e1 + 1;
				e2 = r/2;
				o2 = e2 + 1;
			}
			ans = e1 * e2 + o1 * o2;
			System.out.println(ans);
		}
	}

}
