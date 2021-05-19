import java.util.*;
import java.util.Map.Entry;
public class max_prime_diff{
	
	public static ArrayList<Integer> prime = new ArrayList<>();
	public static void getprime(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i = 2;i*i<=n;i++) {
			for(int j = i*i;j<=n;j+=i) {
				isPrime[j] = false;
			}
		}
		for(int i = 2;i<n;i++) {
			if(isPrime[i] == true) {
				prime.add(i);
			}
		}
	}
	
	public static int nearGreat(int n) {
		int low = 0;
		int ans = 0;
		int min = Integer.MAX_VALUE;
		int high = prime.size() - 1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(prime.get(mid) == n) {
				return prime.get(mid);
			}
			if(prime.get(mid) < n) {
				low = mid + 1;
			}
			if(prime.get(mid) > n) {
				high = mid - 1;
			}
			if(Math.abs(prime.get(mid) - n) < min && prime.get(mid) > n) {
				ans = prime.get(mid);
			}
		}
		return ans;
	}
	
	public static int nearSmall(int n) {
		int low = 0;
		int ans = 0;
		int min = Integer.MAX_VALUE;
		int high = prime.size();
		while(low<=high) {
			int mid = (low + high) / 2;
			if(prime.get(mid) == n) {
				return prime.get(mid);
			}
			if(prime.get(mid) < n) {
				low = mid + 1;
			}
			if(prime.get(mid) > n) {
				high = mid - 1;
			}
			if(Math.abs(prime.get(mid) - n) < min && prime.get(mid) < n) {
				ans = prime.get(mid);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		getprime(10000000);
		int k = 0;
		
		while(t-->0) {
			int l = in.nextInt();
			int r = in.nextInt();
			int ans = nearSmall(r) - nearGreat(l);
			System.out.println(ans < 0 ? -1 : ans);
		}
	}
}