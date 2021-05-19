package The_Great_XOR;
import java.util.*;
public class Solution {
	
	//4 test cases have failed due to TLE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			int count = 0;
			for(int i = 1;i<n;i++) {
				long k = i^n;
				if(k > n) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
