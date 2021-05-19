package AA_Problem;
import java.util.*;
public class Check_anagram {
	
	public static boolean Solve(String a, String b) {
		if(a.length() != b.length()) return false;
		char[] ar = a.toCharArray();
		char[] br = b.toCharArray();
		Arrays.sort(ar);
		Arrays.sort(br);
		return Arrays.equals(ar, br);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String a = in.next();
			String b = in.next();
			System.out.println(Solve(a,b) ? "True" : "False");
		}
	}

}
