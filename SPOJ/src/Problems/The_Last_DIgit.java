package Problems;
import java.math.BigInteger;
import java.util.*;
public class The_Last_DIgit {
	
	static long mod = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long a = in.nextLong();
			long b = in.nextLong();
//			if(a == 2) {
//				int[] p = {2,4,8,6};
//				long r = b % 4;
//				if(r == 0)
//					System.out.println(6);
//				else
//					System.out.println(p[(int)r-1]);
//			}else if(a == 3) {
//				int[] p = {3,9,7,1};
//				long r = b % 4;
//				if(r == 0)
//					System.out.println(1);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 4){
//				int[] p = {4,6};
//				long r = b % 2;
//				if(r == 0)
//					System.out.println(6);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 5) {
//				
//				int[] p = {5};
//				long r = b % 1;
//				if(r == 0)
//					System.out.println(5);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 6) {
//				int[] p = {6};
//				long r = b % 1;
//				if(r == 0)
//					System.out.println(6);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 7) {
//				
//				int[] p = {7,9,3,1};
//				long r = b % 4;
//				if(r == 0)
//					System.out.println(1);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 8) {
//				
//				int[] p = {8,4,2,6};
//				long r = b % 4;
//				if(r == 0)
//					System.out.println(6);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}else if(a == 9) {
//				
//				int[] p = {9,1};
//				long r = b % 2;
//				if(r == 0)
//					System.out.println(1);
//				else
//					System.out.println(p[(int)r-1]);
//				
//			}
			BigInteger x = new BigInteger("1");
			BigInteger y = new BigInteger("1");
			x.valueOf(a);
			y.valueOf(b);
			BigInteger p = new BigInteger("1");
			BigInteger z = new BigInteger("10");
			p = x.pow((int) y.longValue()).mod(z);
			System.out.println(p);
			
			
		}
	}

}
