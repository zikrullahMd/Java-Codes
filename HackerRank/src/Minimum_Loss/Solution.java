package Minimum_Loss;
import java.util.*;
import java.math.*;
public class Solution {
		// PARTIALLY SOLVED. NEED TO BE OPTIMIZED
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] a = new long[(int) n];
		for (long i = 0; i < a.length; i++) {
			a[(int) i] = in.nextLong();
		}
		long min = a[0];
		for (long i = 0; i < a.length-1; i++) {
			for(long j = i+1;j<a.length;j++) {
				if(a[(int) i] > a[(int) j]) {
					long m = a[(int) i] - a[(int) j];
					if(m < min) {
						min = m;
					}
				}
			}
		}
		System.out.println(min);
	}

}
//20 7 8 2 5