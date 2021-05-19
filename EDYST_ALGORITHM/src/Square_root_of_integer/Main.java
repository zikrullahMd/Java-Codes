package Square_root_of_integer;
import java.util.*;
public class Main {
	static int getSQRT(int x) {
		if(x <= 1)
			return x;
		int i = 1;
		int j = x;
		int ans=0;
		while(i<=j) {
			int mid = i + (j-i)/2;
			if(mid <= x/mid) {
				ans = mid;
				i = mid + 1;
			}else {
				j = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(getSQRT(n));
	}

}
