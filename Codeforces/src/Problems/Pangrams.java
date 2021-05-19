package Problems;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next().toLowerCase();
		if(n < 26) {
			System.out.println("NO");
			return;
		}
		Set<Character> set = new HashSet<>();
		for(int i = 0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		if(set.size()<26) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}

}
