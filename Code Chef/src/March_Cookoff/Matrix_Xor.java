package March_Cookoff;
import java.util.*;
public class Matrix_Xor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long m = in.nextLong();
			long k = in.nextLong();
			long xor = 0;
			
			if(n % 2 == 0 && m% 2 == 0) {
				long cxor = 0;
				for(int i = 1;i<=n;i++) {
					cxor ^= i + i + k;
				}
				xor = cxor;
			}
			
		}
	}

}
