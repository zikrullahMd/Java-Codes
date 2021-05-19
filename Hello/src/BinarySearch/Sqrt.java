package BinarySearch;
import java.util.*;
public class Sqrt {
	
	static int SQRT(int n) {
		long low = 1;
		long high = n;
		
		long res = 0;
		while(low <= high) {
			long mid = (low + high) /2;
			if(mid * mid  < n) {
				res = mid;
				low = mid + 1;
			}else if(mid * mid > n) {
				high = mid - 1;
			}else {
				return (int)mid;
			}
		}
		return (int)res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2147483647;
		System.out.println(SQRT(n));
	}

}
