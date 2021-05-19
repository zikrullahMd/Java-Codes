package Factorial_Of_Big_Integer;
import java.math.BigInteger;
import java.util.*;
public class Main {
	
	static BigInteger Fact(long n ) {
		BigInteger f = new BigInteger("1");
		for(int j = 2;j<=n;j++) {
			
			f = f.multiply(BigInteger.valueOf(j));
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(Fact(n));
	}

}
