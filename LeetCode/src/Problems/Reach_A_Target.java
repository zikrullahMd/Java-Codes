package Problems;
import java.util.*;
public class Reach_A_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long target = in.nextLong();
		target = Math.abs(target);
		long pos = 0;
		long n = 0;
		while(pos < target) {
			n++;
			pos+=n;
		}
		
		if(pos == target) {
			System.out.println(n);
			return;
		}
		if(pos > target) {
			long k = pos - target;
			if(k % 2 == 0) {
				System.out.println(n);
				return;
			}else if((n+1) % 2 == 1) {
				System.out.println(n+1);
				return;
			}else {
				System.out.println(n+2);
				return;
			}
		}
	}

}
