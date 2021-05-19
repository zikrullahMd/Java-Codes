package A_Easy_Problem;
import java.util.*;
public class No_Of_Trailing_Zeroes {
	
	public static int CountMethodOne(int n) {
		String s = Long.toBinaryString(n);
		int count = 0;
		int i = s.length()-1;
		while(s.charAt(i--) != '1') {
			count++;
		}
		return count;
	}
	
	public static int CountMethodTwo(int n) {
		int count = 0;
		while((n&1) == 0 && n>0) {
			count++;
			n /= 2;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(CountMethodTwo(n)+" "+CountMethodOne(n));
	}

}
