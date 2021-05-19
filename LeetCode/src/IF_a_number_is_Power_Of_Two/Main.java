package IF_a_number_is_Power_Of_Two;
import java.util.*;
public class Main {
	//check if a number is power of two using its binary form.
	static boolean PowerOfTwoBinary(int x) {
		if((x & x-1) == 0)
			return true;
		else
			return false;
	}
	
	
	static boolean PowerOfTwo(int n) {
		if(n==0)
			return false;
		else {
			while(n % 2 == 0) {
				n /= 2;
			}
			return (n==1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		if(PowerOfTwo(n))
			System.out.print("YES");
		else
			System.out.print("NO");
		if(PowerOfTwoBinary(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
