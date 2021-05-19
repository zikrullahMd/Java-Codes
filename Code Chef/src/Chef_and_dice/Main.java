package Chef_and_dice;
import java.util.*;
public class Main {
	
	public static long Solve(long n) {
		if(n == 1) return 20;
		if(n == 2) return 36;
		if(n == 3) return 51;
		if(n == 4) return 60;
		
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			if(n <= 4) {
				System.out.println(Solve(n));
			}else {
				long lay = 0;
				if(n % 4 != 0) {
					lay = n/4;
				}else {
					lay = (n/4)-1;
				}
				long ans = 0;
				if(lay > 0) {
					ans = lay * 44;
				}
				long n1 = n%4;
				if(n1 == 0) {
					n1 = 4;
				}
				long get = Solve(n1) + 4*(4-n1);
				System.out.println(ans+get);
			}
		}
	}

}
