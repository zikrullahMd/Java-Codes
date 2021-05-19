package AA_Problem;
import java.util.*;
public class Longest_Palindrom_Substring {
	
	static boolean isPalin(String s) {
		StringBuilder sb=new StringBuilder(s);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    return s.equals(rev);
	}
//	NOOB Method
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		while(t-->0) {
//			int n = in.nextInt();
//			String s = in.next();
//			ArrayList<String> list =new ArrayList<>();
//			for(int i = 0;i<s.length();i++) {
//				for(int j = i+1;j<=s.length();j++) {
//					list.add(s.substring(i,j));
//				}
//			}
//			String ans = "";
//			int max = Integer.MIN_VALUE;
//			for(String i : list) {
//				if(isPalin(i) && i.length() > max) {
//					ans = i;
//					max = i.length();
//				}
//			}
//			System.out.println(max);
//		}
//	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			String s = in.next();
			System.out.println(solve(s,n).length());
		}
	}
	public static String solve(String s, int n) {
		if(s == null || n < 1) {
			return "";
		}
		int start = 0;
		int end = 0;
		for(int i = 0;i<s.length();i++) {
			int len1 = expandFromMiddle(s,i,i);
			int len2 = expandFromMiddle(s,i,i+1);
			int len = Math.max(len1, len2);
			if(len > end - start) {
				start = i - ((len - 1)/2);
				end = i + (len / 2);
			}
		}
		return s.substring(start,end+1);
	}
	public static int expandFromMiddle(String s, int left, int right) {
		if(s == null || left > right) {
			return 0;
		}
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

}
