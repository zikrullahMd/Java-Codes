package Split_The_String;

import java.io.IOException;
import java.util.*;
public class Main {
	
	static boolean isSubString(String s, String t) {
		return s.contains(t);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			String ans = "NO";
			String s = in.next();
			for(int i = 0;i<n;i++) {
				if(isSubString(s.substring(0, i),s.substring(i, n))) {
					ans = "YES";
					break;
				}
			}
			
			System.out.println(ans);
		}

	}

}
