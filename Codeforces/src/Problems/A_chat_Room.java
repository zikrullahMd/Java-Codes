package Problems;
import java.util.*;
public class A_chat_Room {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = "hello";
		int i = 0;
		int j = 0;
		String ans = "NO";
		int k = 0;
		for(j = 0;i<t.length();j++) {
			for(i = 0;i<s.length();i++) {
				if(t.charAt(j) == s.charAt(i)) {
					ans = "YES";
				}else {
					k++;
				}
			}
			i = j + 1;
		}
		if(k == t.length()) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
