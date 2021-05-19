package Problems;
import java.util.*;
public class Next_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ArrayList<Long> pal = new ArrayList<>();
		for(long i = 1;i<=1000001;i++) {
			sb.append(i);
			if(i == Long.parseLong(sb.reverse().toString())) {
				pal.add(i);
			}
			sb.delete(0,sb.length());
		}
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			for(long i : pal) {
				if(i > n) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}