package gcd_Operation;
import java.util.*;
import java.math.*;
public class Main {
	static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n+1];
			int[] b = new int[n+1];
			//taking b array input
			for (int i = 1; i <= n; i++) {
				b[i] = in.nextInt();
			}
			//filling array a
			for (int i = 1; i <= n; i++) {
				a[i] = i;
			}
			int target = 0;
			for(int i = 1;i<=n;i++) {
				if(a[i] != b[i]) {
					target = b[i];
					break;
				}
			}
			int f = 1;
			int l = n;
			String ans = "NO";
			while(f < l) {
				if(gcd(a[f],a[l]) > target) {
					l--;
				}else if(gcd(a[f],a[l]) < target) {
					f++;
				}else {
					ans = "YES";
					break;
				}
				
			}
			System.out.println(ans);
		}
	}

}
