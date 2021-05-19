package Largest_PALINDROME_STRING;
import java.util.*;
public class Main {
	
	static boolean isPalin(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		if(s.equals(rev))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] a = new String[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.next();
		}
		int max = 0;
		String ans = "";
		int t = 0;
		for(String s : a) {
			if(isPalin(s)) {
				int len = s.length();
				if(len > max) {
					max = len;
					ans = s;
				}
			}else {
				t++;
			}
		}
		if(t==a.length) {
			System.out.println("-1");
		}else {
			System.out.println(ans);
		}
		
	}

}
