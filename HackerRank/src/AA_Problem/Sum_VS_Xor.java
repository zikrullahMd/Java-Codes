package AA_Problem;
import java.math.BigInteger;
import java.util.*;
public class Sum_VS_Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int count = 0;
//		for(int i = 0;i<n;i++) {
//			if(n + i == (n ^ i)) {
//				count++;
//			}
//		}
		String s = Long.toBinaryString(n);
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '0') {
				count++;
			}
		}
		BigInteger f = new BigInteger("1");
		f.valueOf((long) Math.pow(2, count));
		
	}

}
