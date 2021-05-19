package problems;
import java.math.BigInteger;
import java.util.*;
public class Largest_Number {
	
	private static class LargerNumberComparator implements Comparator<String>{

		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String a = o1 + o2;
			String b = o2 + o1;
			
			return a.compareTo(b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		String[] str = new String[n];
		for(int i = 0;i<n;i++) {
			str[i] = String.valueOf(a[i]);
		}
		Arrays.sort(str, new LargerNumberComparator());
		if(str[0].equals("0")) {
			System.out.println(0);
			return;
		}
		String ans = new String();
		for(String i : str) {
			ans += i;
		}
		
		System.out.println(ans);
	}

}
