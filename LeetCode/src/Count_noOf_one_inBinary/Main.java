package Count_noOf_one_inBinary;
import java.util.*;
public class Main {
	//Naive approach
	static int countNoOfONE(int n) {
		String c = Integer.toBinaryString(n);
		int count = 0;
		for(int i = 0;i<c.length();i++) {
			if(c.charAt(i) == '1')
				count++;
		}
		return count;
		
	}

	
	static int countNoOfONE_PRO( int n) {
		int count = 0;
		while(n > 0) {
			n &= n-1;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Naive "+countNoOfONE(n));
		System.out.println("Pro Bit "+countNoOfONE_PRO(n));
	}

}
