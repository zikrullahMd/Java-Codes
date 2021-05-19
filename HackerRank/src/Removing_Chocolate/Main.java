package Removing_Chocolate;
import java.util.*;
class Main {
	static int mod = 1000000007;
	
	static int choc(long n) {
		
			if(n == 1)
				return 1;
			if(n == 2)
				return 1;
			if(n == 3)
				return 2;
			return  (choc((n % mod)-3) % mod + choc((n % mod)-1) % mod) % mod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(choc(n%mod));
	}

}

