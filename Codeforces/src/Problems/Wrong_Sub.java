package Problems;
import java.util.*;
public class Wrong_Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int k = in.nextInt();
		while(k != 0) {
			long r = n % 10;
			if(r != 0) {
				n = n - 1;
			}else {
				n /= 10;
			}
			k--;
		}
		System.out.println(n);
	}

}
