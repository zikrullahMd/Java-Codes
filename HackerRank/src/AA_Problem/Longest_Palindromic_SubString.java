package AA_Problem;
import java.util.*;
public class Longest_Palindromic_SubString {
	
	static boolean Palindrome(String s) {
		StringBuilder st = new StringBuilder(s);
		return st.equals(st.reverse()) ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			String s = in.next();
			int max = Integer.MIN_VALUE;
			for(int f = 0;f<n;f++) {
				int i = f;
				int j = f;
				if(Palindrome(s.substring(i,j+1))) {
					max = Integer.max(max,s.subSequence(i, j).length());
				}
			}
			System.out.println(max);
		}
	}

}
