package AA_Problem;
import java.util.*;
public class Alice_library {
	
	public static char Solve(String s) {
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(j<s.length() && s.charAt(i) == s.charAt(j)) {
					return s.charAt(i);
				}
			}
		}
		return '.';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String s = in.next();
			System.out.println(Solve(s));
		}
	}

}
