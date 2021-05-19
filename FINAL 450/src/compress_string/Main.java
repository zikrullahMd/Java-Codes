package compress_string;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String s = in.next();
			StringBuilder ans = new StringBuilder();
			String a = "";
			int i = 0;
			while(i < s.length()) {
				int j = i;
				while(j<s.length() && s.charAt(i)==s.charAt(i)) {
					j++;
				}
				a+= a.charAt(i)+j-i;
				i=j;
			}
			System.out.println(ans);
		}
	}

}
