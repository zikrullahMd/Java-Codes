package The_Order;
import java.util.*;
import java.math.*;
public class Main {
	static String[] lexi(String str) {
		String mx = "";
		String[] string = new String[str.length()];
		for(int i = 0;i<str.length();i++) {
			string[i] = str.subSequence(0, i)+str.substring(i+1, str.length());
		}
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		String[] str = lexi(s);
		String min = "";
		Arrays.sort(str);
		System.out.println(str[0]);
	}

}
