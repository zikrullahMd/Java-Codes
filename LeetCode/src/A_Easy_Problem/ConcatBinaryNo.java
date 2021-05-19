package A_Easy_Problem;
import java.util.*;
import java.math.BigInteger;
public class ConcatBinaryNo {
	static int mod = 100000007;
	
	static int pow(int a, double dig){
        int temp;
        if(dig == 0){
            return 1;
        }
        temp = pow(a,dig/2);
        if(dig%2 == 0)
            return (temp % mod *temp % mod) % mod;
        else
            return (a%mod*temp%mod*temp%mod)%mod;
    }
	
	static int mul(int a, int b) {
		return (a % mod * b % mod) % mod;
	}
	
	static int add(int a, int b) {
		return (a % mod + b % mod) % mod;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = 0;
		for(int i = 1;i<=n;i++) {
			double dig = (Math.log(i) + 1);
			res = mul(res,pow(2,dig));
			res = add(res,i);
		}
		System.out.println(res);
		
	}

}
