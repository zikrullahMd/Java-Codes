package Problem_on_Strings;
import java.util.*;
public class HackerRank_inString {
	
	static String Check(String s) {
		int n = s.length();
		String h = "hackerrank";
		int j = 0;
		if(n < h.length())
			return "NO";
		for(int i = 0;i<s.length();i++) {
			if(j<h.length() && s.charAt(i) == h.charAt(j)) {
				j++;
			}
		}
		return (j == h.length() ? "YES": "NO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
				String s = in.next();
				System.out.println(Check(s));
				
		}
	}

}
