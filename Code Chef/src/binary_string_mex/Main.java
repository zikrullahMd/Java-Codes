package binary_string_mex;

import java.util.*;
public class Main {
	
	static Set<String> list = new HashSet<>();
	
	public static void print(String t, int i , int j, String s) {
		if(i == j) {
			list.add(t);
			//System.out.println(t);
		}else {
			print(t,i+1,j,s);
			t += s.charAt(i);
			print(t,i+1,j,s);
		}
	}
	public static String Solve(String s) {
		String ans = "";
		for(int i = 0;i<100000;i++) {
			if(!list.contains(Integer.toBinaryString(i))) {
				return Integer.toBinaryString(i);
			}
		}
		return "0";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String s = in.next();
			print("",0,s.length(),s);
			System.out.println(Solve(s));
			list.clear();
		}
	}

}
