package Problems;
import java.util.*;
public class Count_Total_Set_Bits {
	static long mod = 1000000007;
	static long getBitCount(long n) {
		long count = 0;
		while(n>0) {
			n = (n % mod & (n-1) % mod) % mod;
			count++;
		}
		return count;
	}
	public static int countSetBits(int n){
	    int count=0;
	    while(n>0){
	        int i= (int)(Math.log10(n)/Math.log10(2));
	        count =(int) ((int) ((count % mod) + (Math.pow(2, i-1)*i) % mod)%mod);
	        count= (int) (((count % mod)+ ( n-Math.pow(2, i)+1 % mod))%mod);
	        n= (int) ((n%mod)- (Math.pow(2, i) % mod) % mod);
	    }
	    return count;
	}
	static int dpsolve(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		int sum = 0;
		for(int i = 0;i<=n;i++) {
			dp[i] = (int) ((dp[i>>1] % mod) + ((i&1) % mod) % mod);
			sum += dp[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("normal "+countSetBits(n));
		System.out.println("dp "+dpsolve(n));
	}

}
