package CheckIf_ith_bit_is_SET;
import java.util.*;
public class Main {
	static boolean check(int n , int k) {
		if((n & (1<<k)) > 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println(check(n,k));
	}

}
