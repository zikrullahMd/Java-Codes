package Big_factorial;
import java.util.*;
import java.math.*;

public class Main {
	
	static BigInteger fact(int n) {
		BigInteger fact = new BigInteger("1");
		for(int i = 2;i<=n;i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 995;
		System.out.println(fact(n));
	}

}