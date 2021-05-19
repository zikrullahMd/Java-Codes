package Problems;
import java.util.*;
public class Beautiful_Days_at_Movies {
	
	static int Rev(int n) {
		int rev = 0;
		while(n>0) {
			int r = n % 10;
			rev = (rev * 10) + r;
			n /=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		int l = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for(int i = f;i<=l;i++) {
			if(Math.abs(i-Rev(i))%k==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
