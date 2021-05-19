package THIS_IS_PERFECT;
import java.util.*;
public class Main {
	//Method to check if a number is prime or not
	static boolean isPrime(long n ) {
		if(n<=1)
			return false;
		if(n<=3)
			return true;
		if(n % 2 == 0 || n % 3 == 0)
			return false;
		for(int i = 5;i*i<=n;i++) {
			if(n % i == 0 || n % (i+2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			int sum = 0;
			if(isPrime(n)) {
				System.out.println("NO");
			}else {
				for(int i = 1;i<=n;i++) {
					if( i % n == 0) {
						sum += i;
					}
				}
				if(n == sum) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}
	}

}
