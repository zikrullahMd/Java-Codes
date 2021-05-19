package Problems;
//import java.util.*;
//public class Nearly_Lucky {
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		long n = in.nextLong();
//		long count = 0;
//		while(n > 0) {
//			long r = n % 10;
//			r /= 10;
//			if(r == 4 || r == 7) count++;
//		}
//		if(count == 4 || count == 7)System.out.println("YES");
//		else System.out.println("NO");
//	}
//
//}

import java.util.*;

public class Nearly_Lucky {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();
		int count = 0;
		while(t > 0) {
			long curr = t % 10;
			t /= 10;
			if(curr == 4 || curr == 7) count++;
		}
		if(count == 4 || count == 7) System.out.println("YES");
		else System.out.println("NO");
	}
 
}