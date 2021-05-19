package A_Easy_Problem;
import java.util.*;
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp = n;
		if(temp > 0) {
			int rev = 0;
			while(temp>0) {
				int r = temp % 10;
				rev = rev * 10 + r;
				temp /= 10;
			}
			System.out.println(rev);
		}else {
			temp *= -1;
			int rev = 0;
			while(temp>0) {
				int r = temp % 10;
				rev = rev * 10 + r;
				temp /= 10;
			}
			rev *= -1;
			System.out.println(rev);
		}
		
		
	}

}
