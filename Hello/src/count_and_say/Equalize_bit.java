package count_and_say;
import java.util.*;
public class Equalize_bit {
	
	public static String swap(String a, int i , int j) {
		char[] aa = a.toCharArray();
		char temp = aa[i];
		aa[i] = aa[j];
		aa[j] = temp;
		return new String(aa);
	}
	
	public static String flip(String a, int i) {
		char[] ar = a.toCharArray();
		if(ar[i] == '1') {
			ar[i] = '0';
		}else {
			ar[i] = '1';
		}
		return new String(ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int cost = 0;
		int n = a.length();
		if(a.equals(b)) {
			System.out.println(cost);
			return;
		}
		
		int i = 0;
		while(i<a.length()) {
			if(a.charAt(i)!=b.charAt(i)) {
				if(i+1<n && a.charAt(i) == b.charAt(i+1) && a.charAt(i+1) == b.charAt(i)) {
					a = swap(a,i,i+1);
					cost++;
				}else {
					a = flip(a,i);
					cost++;
				}
			}
			i++;
		}
		System.out.println(a);
		System.out.println(cost);
	}

}
